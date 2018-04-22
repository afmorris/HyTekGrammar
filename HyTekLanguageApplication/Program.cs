using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Drawing;
using System.Net;
using Antlr4.Runtime;
using HtmlAgilityPack;
using HyTekLanguageApplication.Constants;
using HyTekLanguageApplication.DataModels;
using HyTekLanguageApplication.Extensions;
using HyTekLanguageApplication.Listeners;
using HyTekLanguageApplication.Models;
using OhioTrackStats.DataModels.Converters;
using ServiceStack.Configuration;
using ServiceStack.Data;
using ServiceStack.OrmLite;
using ServiceStack.OrmLite.Dapper;
using Meet = HyTekLanguageApplication.Models.Meet;
using DatabaseColorConverter = HyTekLanguageApplication.Models.Converters.ColorConverter;

namespace HyTekLanguageApplication
{
    class Program
    {
        private static IDbConnectionFactory dbFactory;
        private static readonly string MeetName = "Jackson Invitational";
        private static readonly Guid LocationId = new Guid("E3982FC2-E647-43DB-BED2-AA3EA20551F3");
        private static readonly DateTimeOffset MeetDate = new DateTimeOffset(2018, 3, 30, 0, 0, 0, TimeSpan.Zero);

        private static readonly Dictionary<string, HashSet<string>> SchoolLookup = new Dictionary<string, HashSet<string>>
        {
            {"Bidwell River Valley", new HashSet<string> { "River Valley" }},
            {"Albany Alexander", new HashSet<string> { "Alexander" }},
            {"Jackson", new HashSet<string> { "Jackson" }},
            {"Oak Hill", new HashSet<string> { "Oak Hill" }},
            {"Pomeroy Meigs", new HashSet<string> { "Meigs" }},
            {"Minford", new HashSet<string> { "Minford" }},
            {"Wellston", new HashSet<string> { "Wellston" }},
            {"Beaver Eastern", new HashSet<string> { "Bea. Eastern" }},
        };

        private static readonly IAppSettings Settings = new AppSettings();
        public static readonly File File = new File();

        static void Main(string[] args)
        {
            SetupDbFactory();
            string html;
            var url = "http://www.baumspage.com/track/madisoncomp/2018/2018%20Results.htm";
            //var url = "http://www.baumspage.com/track/loudenville/2018/2018%20Results.htm";
            using (var client = new WebClient())
            {
                html = client.DownloadString(url);
            }

            var doc = new HtmlDocument();
            doc.LoadHtml(html);

            var preNode = doc.DocumentNode.SelectSingleNode("//pre");
            var content = preNode.InnerText;

            AntlrInputStream inputStream = new AntlrInputStream(content);
            HyTekLexer lexer = new HyTekLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            HyTekParser parser = new HyTekParser(tokenStream);
            parser.AddParseListener(new LicenseListener());
            parser.AddParseListener(new ExportInfoListener());
            parser.AddParseListener(new MeetInfoListener());
            parser.AddParseListener(new EventListener());
            parser.file();

            PopulateDatabase();

            Console.ReadLine();
        }

        private static void SetupDbFactory()
        {
            SqlServer2014Dialect.Provider.RegisterConverter<Gender>(new GenderConverter());
            SqlServer2014Dialect.Provider.RegisterConverter<TimingMethod>(new TimingMethodConverter());
            SqlServer2014Dialect.Provider.RegisterConverter<Color>(new DatabaseColorConverter());
            SqlServer2014Dialect.Provider.RegisterConverter<PerformanceData>(new PerformanceDataConverter());

            dbFactory = new OrmLiteConnectionFactory(Settings.GetString("DbConnection"), SqlServer2014Dialect.Provider);
        }

        private static void PopulateDatabase()
        {
            var meet = GetOrCreateMeet();
            NormalizeResults(meet);
        }

        private static Meet GetOrCreateMeet()
        {
            var meet = GetMeet();
            if (meet != null)
            {
                return meet;
            }

            return CreateMeet();
        }

        private static Meet GetMeet()
        {
            using (var db = dbFactory.Open())
            {
                return db.Single<Meet>(x => x.Name == MeetName && x.Date == MeetDate && x.LocationId == LocationId);
            }
        }

        private static Meet CreateMeet()
        {
            using (var db = dbFactory.Open())
            {
                var sql = "INSERT INTO [dbo].[Meet] ([Name], [Date], [LocationId]) VALUES (@Name, @Date, @LocationId)";
                db.Execute(sql, new {Name = MeetName, Date = MeetDate, LocationId});
            }

            return GetMeet();
        }

        private static void NormalizeResults(Meet meet)
        {
            foreach (var @event in File.Events)
            {
                var eventName = @event.EventInfo.Name.TranslateEventName();
                var gender = @event.EventInfo.Gender.TranslateGender();
                var dbEvent = GetEvent(eventName, gender);
                PopulateAthletesAndPerformances(@event.EventResults, dbEvent, meet);
            }

            int b = 2;
        }

        private static TrackAndFieldEvent GetEvent(string eventName, Gender gender)
        {
            using (var db = dbFactory.Open())
            {
                return db.Single<TrackAndFieldEvent>(x => x.Name == eventName && x.Gender == gender);
            }
        }

        private static void PopulateAthletesAndPerformances(IList<EventResult> eventResults, TrackAndFieldEvent dbEvent, Meet meet)
        {
            foreach (var result in eventResults)
            {
                var school = result.SchoolName.TranslateSchool(SchoolLookup);
                var dbSchool = GetSchool(school);
                var performance = GetOrCreatePerformance(dbEvent.Id, dbSchool.Id, meet.Id, (decimal)result.Performance.Data, meet.Date, dbEvent.IsRunningEvent);

                if (dbEvent.IsRelayEvent)
                {
                    if (result is RelayResult relayResult)
                    {
                        // go through the legs
                        foreach (var leg in relayResult.LegInfo.Legs)
                        {
                            var firstName = leg.AthleteName.GetFirstName();
                            var lastName = leg.AthleteName.GetLastName();
                            var year = leg.AthleteYear.ParseYear();

                            var athlete = GetOrCreateAthlete(firstName, lastName, year, dbSchool, dbEvent.Gender);
                            var athletePerformance = GetOrCreateAthletePerformance(athlete.Id, performance.Id);
                        }
                    }
                }
                else
                {
                    if (result is IndividualResult individualResult)
                    {
                        var firstName = individualResult.AthleteName.GetFirstName();
                        var lastName = individualResult.AthleteName.GetLastName();
                        var year = individualResult.AthleteYear.ParseYear();

                        var athlete = GetOrCreateAthlete(firstName, lastName, year, dbSchool, dbEvent.Gender);
                        var athletePerformance = GetOrCreateAthletePerformance(athlete.Id, performance.Id);
                    }   
                }
            }
        }

        private static Models.Performance GetOrCreatePerformance(Guid eventId, Guid schoolId, Guid meetId, decimal data, DateTimeOffset date, bool isRunningEvent)
        {
            var performance = GetPerformance(eventId, schoolId, meetId, data, date, isRunningEvent);
            if (performance != null)
            {
                return performance;
            }

            return CreatePerformance(eventId, schoolId, meetId, data, date, isRunningEvent);
        }

        private static Models.Performance GetPerformance(Guid eventId, Guid schoolId, Guid meetId, decimal data, DateTimeOffset date, bool isRunningEvent)
        {
            using (var db = dbFactory.Open())
            {
                var timingMethod = isRunningEvent ? TimingMethod.FullyAutomatic : TimingMethod.FieldEvent;
                return db.Single<Models.Performance>(x => x.EventId == eventId && x.SchoolId == schoolId && x.MeetId == meetId && x.Data == data && x.Date == date && x.TimingMethod == timingMethod);
            }
        }

        private static Models.Performance CreatePerformance(Guid eventId, Guid schoolId, Guid meetId, decimal data, DateTimeOffset date, bool isRunningEvent)
        {
            using (var db = dbFactory.Open())
            {
                var timingMethod = isRunningEvent ? TimingMethod.FullyAutomatic : TimingMethod.FieldEvent;
                var sql = "INSERT INTO [dbo].[Performance] ([EventId], [SchoolId], [MeetId], [Data], [Date], [TimingMethod]) VALUES (@EventId, @SchoolId, @MeetId, @Data, @Date, @TimingMethod)";
                db.Execute(sql, new {EventId = eventId, SchoolId = schoolId, MeetId = meetId, Data = data, Date = date, TimingMethod = timingMethod.ToString() });
            }

            return GetPerformance(eventId, schoolId, meetId, data, date, isRunningEvent);
        }

        private static AthletePerformance GetOrCreateAthletePerformance(Guid athleteId, Guid performanceId)
        {
            var athletePerformance = GetAthletePerformance(athleteId, performanceId);
            if (athletePerformance != null)
            {
                return athletePerformance;
            }

            return CreateAthletePerformance(athleteId, performanceId);
        }

        private static AthletePerformance GetAthletePerformance(Guid athleteId, Guid performanceId)
        {
            using (var db = dbFactory.Open())
            {
                return db.Single<AthletePerformance>(x => x.AthleteId == athleteId && x.PerformanceId == performanceId);
            }
        }

        private static AthletePerformance CreateAthletePerformance(Guid athleteId, Guid performanceId)
        {
            using (var db = dbFactory.Open())
            {
                var sql = "INSERT INTO [dbo].[AthletePerformance] ([AthleteId], [PerformanceId]) VALUES (@AthleteId, @PerformanceId)";
                db.Execute(sql, new {AthleteId = athleteId, PerformanceId = performanceId});
            }

            return GetAthletePerformance(athleteId, performanceId);
        }

        private static School GetSchool(string schoolName)
        {
            using (var db = dbFactory.Open())
            {
                return db.Single<School>(x => x.OhsaaTournamentName == schoolName);
            }
        }

        private static Athlete GetOrCreateAthlete(string firstName, string lastName, int? year, School school, Gender gender)
        {
            var athlete = GetAthlete(firstName, lastName, year, school, gender);
            if (athlete != null)
            {
                return athlete;
            }

            return CreateAthlete(firstName, lastName, year, school, gender);
        }

        private static Athlete GetAthlete(string firstName, string lastName, int? year, School school, Gender gender)
        {
            using (var db = dbFactory.Open())
            {
                return db.Single<Athlete>(x => x.FirstName == firstName && x.LastName == lastName && x.GraduationYear == year && x.SchoolId == school.Id && x.Gender == gender);
            }
        }

        private static Athlete CreateAthlete(string firstName, string lastName, int? year, School school, Gender gender)
        {
            using (var db = dbFactory.Open())
            {
                var sql = "INSERT INTO [dbo].[Athlete] ([FirstName], [LastName], [Gender], [SchoolId], [GraduationYear]) VALUES (@FirstName, @LastName, @Gender, @SchoolId, @GraduationYear)";
                db.Execute(sql, new { FirstName = firstName, LastName = lastName, Gender = gender.ToString(), SchoolId = school.Id, GraduationYear = year});
            }

            return GetAthlete(firstName, lastName, year, school, gender);
        }
    }
}

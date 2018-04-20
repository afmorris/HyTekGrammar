using System;
using System.Net;
using Antlr4.Runtime;
using HtmlAgilityPack;
using HyTekLanguageApplication.DataModels;
using HyTekLanguageApplication.Listeners;

namespace HyTekLanguageApplication
{
    class Program
    {
        private static string MeetName = "Zane Trace Invitational";
        private static Guid LocationId = new Guid("7CEA00AE-0756-4AAF-B41D-30C8BDF8DB54");
        private static DateTimeOffset MeetDate = new DateTimeOffset(2018, 3, 29, 0, 0, 0, TimeSpan.Zero);

        public static readonly File File = new File();

        static void Main(string[] args)
        {
            string html;
            var url = "http://www.baumspage.com/track/zanetrace/2018/Results%20(meet%20suspended%20after%20girls%203200).htm";
            //var url = "http://www.baumspage.com/track/jackson/2018/Results.htm";
            //var url = "http://www.baumspage.com/track/madisoncomp/2018/2018%20Results.htm";
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

            int a = 1;
            Console.ReadLine();
        }

        private static void PopulateDatabase()
        {
            var meet = new Models.Meet();
            meet.Name = MeetName;
            meet.Date = MeetDate;
            meet.LocationId = LocationId;


        }
    }
}

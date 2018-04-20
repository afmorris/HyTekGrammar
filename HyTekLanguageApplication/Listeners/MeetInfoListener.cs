using System;

namespace HyTekLanguageApplication.Listeners
{
    public class MeetInfoListener : HyTekBaseListener
    {
        public override void ExitMeetInfo(HyTekParser.MeetInfoContext context)
        {
            //Program.File.Meet.Name = string.Join(" ", context.meetName().children);

            //var day = int.Parse(context.meetDate().date().day().GetText());
            //var month = int.Parse(context.meetDate().date().month().GetText());
            //var year = int.Parse(context.meetDate().date().year().GetText());
            //Program.File.Meet.Date = new DateTime(year, month, day);

            //if (context.meetLocation()?.words()?.children != null)
            //{
            //    var meetLocationTokens = context.meetLocation().words();
            //    Program.File.Meet.Location = string.Join(" ", meetLocationTokens.children);
            //}

            base.ExitMeetInfo(context);
        }
    }
}
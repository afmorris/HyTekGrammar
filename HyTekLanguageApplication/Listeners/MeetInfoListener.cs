using System;

namespace HyTekLanguageApplication.Listeners
{
    public class MeetInfoListener : HyTekBaseListener
    {
        public override void ExitMeetInfo(HyTekParser.MeetInfoContext context)
        {
            var meetNameTokens = context.meetName().words();
            Program.File.Meet.Name = string.Join(" ", meetNameTokens.children);

            var day = int.Parse(context.meetDate().date().day().GetText());
            var month = int.Parse(context.meetDate().date().month().GetText());
            var year = int.Parse(context.meetDate().date().year().GetText());
            Program.File.Meet.Date = new DateTime(year, month, day);

            var meetLocationTokens = context.meetLocation().words();
            Program.File.Meet.Location = string.Join(" ", meetLocationTokens.children);

            base.ExitMeetInfo(context);
        }
    }
}
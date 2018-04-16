using System;

namespace HyTekLanguageApplication.Listeners
{
    public class ExportInfoListener : HyTekBaseListener
    {
        public override void ExitExportInfo(HyTekParser.ExportInfoContext context)
        {
            var day = int.Parse(context.exportDate().date().day().GetText());
            var month = int.Parse(context.exportDate().date().month().GetText());
            var year = int.Parse(context.exportDate().date().year().GetText());

            var hour = int.Parse(context.exportDate().clockTime().hour().GetText());
            var minute = int.Parse(context.exportDate().clockTime().minute().GetText());
            int.TryParse(context.exportDate().clockTime().second()?.GetText(), out int second);

            var period = context.exportDate().clockTime().period().GetText();
            if (!period.Equals("AM", StringComparison.InvariantCultureIgnoreCase))
            {
                hour += 12;
            }

            var exportDate = new DateTime(year, month, day, hour, minute, second);
            Program.File.ExportInfo.ExportDate = exportDate;

            base.ExitExportInfo(context);
        }
    }
}
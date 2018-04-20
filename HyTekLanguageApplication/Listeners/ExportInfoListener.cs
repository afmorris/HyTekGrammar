using System;

namespace HyTekLanguageApplication.Listeners
{
    public class ExportInfoListener : HyTekBaseListener
    {
        public override void ExitExportInfo(HyTekParser.ExportInfoContext context)
        {
            //var day = 1;
            //var month = 1;
            //var year = 2018;
            //var hour = 12;
            //var minute = 0;
            //int second = 0;
            //var period = "AM";

            //if (context.exportDate().date()?.day() != null && context.exportDate().date()?.month() != null && context.exportDate().date()?.year() != null)
            //{
            //    int.TryParse(context.exportDate().date().day().GetText(), out day);
            //    int.TryParse(context.exportDate().date().month().GetText(), out month);
            //    int.TryParse(context.exportDate().date().year().GetText(), out year);
            //}

            //if (context.exportDate().clockTime()?.hour() != null && context.exportDate().clockTime()?.minute() != null && context.exportDate().clockTime()?.second() != null && !string.IsNullOrEmpty(context.exportDate().clockTime()?.period().GetText()))
            //{
            //    int.TryParse(context.exportDate().clockTime().hour().GetText(), out hour);
            //    int.TryParse(context.exportDate().clockTime().minute().GetText(), out minute);
            //    int.TryParse(context.exportDate().clockTime().second()?.GetText(), out second);
            //    period = context.exportDate().clockTime().period().GetText();
            //}
            
            //if (!period.Equals("AM", StringComparison.InvariantCultureIgnoreCase))
            //{
            //    hour += 12;
            //}

            //var exportDate = new DateTime(year, month, day, hour, minute, second);
            //Program.File.ExportInfo.ExportDate = exportDate;

            base.ExitExportInfo(context);
        }
    }
}
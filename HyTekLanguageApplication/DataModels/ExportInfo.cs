using System;

namespace HyTekLanguageApplication.DataModels
{
    public class ExportInfo
    {
        public DateTime ExportDate { get; set; }

        public override string ToString()
        {
            return $"{this.ExportDate:g}";
        }
    }
}
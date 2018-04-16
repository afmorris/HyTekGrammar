using System;
using System.Collections.Generic;

namespace HyTekLanguageApplication.DataModels
{
    public class File
    {
        public License License { get; set; } = new License();
        public ExportInfo ExportInfo { get; set; } = new ExportInfo();
        public Meet Meet { get; set; } = new Meet();
        public IList<Event> Events { get; set; } = new List<Event>();
    }
}
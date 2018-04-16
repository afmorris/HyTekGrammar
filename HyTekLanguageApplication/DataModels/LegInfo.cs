using System.Collections.Generic;

namespace HyTekLanguageApplication.DataModels
{
    public class LegInfo
    {
        public IList<Leg> Legs { get; set; } = new List<Leg>();
    }
}
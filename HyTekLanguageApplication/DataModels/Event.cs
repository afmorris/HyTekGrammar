using System.Collections.Generic;

namespace HyTekLanguageApplication.DataModels
{
    public class Event
    {
        public EventInfo EventInfo { get; set; } = new EventInfo();
        public string EventHeader { get; set; }
        public IList<EventResult> EventResults { get; set; } = new List<EventResult>();

        public override string ToString()
        {
            return $"{this.EventInfo} | {this.EventResults.Count} Results";
        }
    }
}
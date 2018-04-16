using HyTekLanguageApplication.DataModels;

namespace HyTekLanguageApplication.Listeners
{
    public class EventListener : HyTekBaseListener
    {
        public override void ExitEvent(HyTekParser.EventContext context)
        {
            var @event = new Event();

            @event.EventInfo.Number = int.Parse(context.eventInfo().eventNumber().number().GetText());
            @event.EventInfo.Gender = context.eventInfo().eventGender().GetText();
            @event.EventInfo.Name = context.eventInfo().eventName().GetText();

            @event.EventHeader = context.eventHeader().GetText();

            foreach (var eventResult in context.eventResult())
            {
                if (eventResult.individualResult() != null)
                {
                    var result = new IndividualResult();
                    @event.EventResults.Add(result);
                }
                else
                {
                    var relayContext = eventResult.relayResult();
                    var result = new RelayResult();
                    int.TryParse(relayContext.place().GetText(), out var place);
                    result.Place = place;
                    result.SchoolName = relayContext.schoolName().GetText();
                    result.Seed = new Performance();
                    result.Performance = new Performance();

                    @event.EventResults.Add(result);
                }
            }

            Program.File.Events.Add(@event);

            base.ExitEvent(context);
        }
    }
}
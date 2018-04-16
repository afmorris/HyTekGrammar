namespace HyTekLanguageApplication
{
    public class HyTekVisitor : HyTekBaseVisitor<object>
    {
        public override object VisitFile(HyTekParser.FileContext context)
        {
            var license = context.license().licensee().words();

            return base.VisitFile(context);
        }
    }
}
using System.Collections.Generic;
using System.Linq;

namespace HyTekLanguageApplication.Listeners
{
    public class LicenseListener : HyTekBaseListener
    {
        public override void ExitLicense(HyTekParser.LicenseContext context)
        {
            //var tokenGroups = context.licensee().words();
            //var list = new List<string>();
            //foreach (var tokenGroup in tokenGroups)
            //{
            //    foreach (var child in tokenGroup.children)
            //    {
            //        list.Add(child.GetText());
            //    }
            //}
            //Program.File.License.Licensee = string.Join(" ", list);

            base.ExitLicense(context);
        }
    }
}
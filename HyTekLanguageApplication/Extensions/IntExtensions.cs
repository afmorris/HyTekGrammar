namespace HyTekLanguageApplication.Extensions
{
    public static class IntExtensions
    {
        public static int? ParseYear(this int? grade)
        {
            if (grade == null)
            {
                return null;
            }

            switch (grade)
            {
                case 9:
                case 21:
                    return 2021;
                case 10:
                case 20:
                    return 2020;
                case 11:
                case 19:
                    return 2019;
                case 12:
                case 18:
                    return 2018;
                default:
                    return null;
            }
        }
    }
}
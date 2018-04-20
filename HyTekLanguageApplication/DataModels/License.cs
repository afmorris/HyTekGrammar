namespace HyTekLanguageApplication.DataModels
{
    public class License
    {
        public string Licensee { get; set; }

        public override string ToString()
        {
            return $"Licensed to {this.Licensee}";
        }
    }
}
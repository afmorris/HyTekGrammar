using System.Net;
using Antlr4.Runtime;
using HtmlAgilityPack;

namespace HyTekLanguageApplication
{
    class Program
    {
        static void Main(string[] args)
        {
            var html = string.Empty;
            var url = "http://www.baumspage.com/track/zanetrace/2018/Results%20(meet%20suspended%20after%20girls%203200).htm";
            using (var client = new WebClient())
            {
                html = client.DownloadString(url);
            }

            var doc = new HtmlDocument();
            doc.LoadHtml(html);

            var preNode = doc.DocumentNode.SelectSingleNode("//pre");
            var content = preNode.InnerText;

            AntlrInputStream inputStream = new AntlrInputStream(content);
            HyTekLexer lexer = new HyTekLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            HyTekParser parser = new HyTekParser(tokenStream);

            var file = parser.file();
            int a = 1;
        }
    }
}

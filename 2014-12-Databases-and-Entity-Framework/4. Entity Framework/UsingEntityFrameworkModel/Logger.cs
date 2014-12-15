using System;

namespace UsingEntityFrameworkModel
{
    public class Logger
    {
        public static string SeparatorLine { get; private set; }
    
        static Logger()
        {
            SeparatorLine = new string('-', 50);
        }

        public static void PrintQueries(object query)
        {
            Console.WriteLine(SeparatorLine);
            Console.WriteLine(query.ToString());
            Console.WriteLine(SeparatorLine);
        }
    }
}

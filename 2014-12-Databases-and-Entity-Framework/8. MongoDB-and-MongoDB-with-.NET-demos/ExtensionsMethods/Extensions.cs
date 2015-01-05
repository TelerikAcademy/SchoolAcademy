using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExtensionsMethods
{
    public static class Extensions
    {
        public static void Print<T>(this IEnumerable<T> collection)
        {
            string separator = "-".Repeat(50);

            Console.WriteLine(separator);

            foreach (var item in collection)
            {
                Console.WriteLine(item);
            }

            Console.WriteLine(separator);
        }

        public static string Repeat(this string str, int count)
        {
            var builder = new StringBuilder(str.Length * count);
            for (int i = 0; i < count; i++)
            {
                builder.Append(str);
            }

            return builder.ToString();
        }
    }
}

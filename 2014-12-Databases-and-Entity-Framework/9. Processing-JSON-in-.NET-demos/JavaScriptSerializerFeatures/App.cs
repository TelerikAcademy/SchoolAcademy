using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web.Script.Serialization;
using Extensions;

namespace JavaScriptSerializerFeatures
{
    public class App
    {
        public static void Main()
        {
            var digits = new Dictionary<string, int>
            {
                { "one", 1 },
                { "two", 2 },
                { "three", 3 },
                { "four", 4 },
                { "five", 5 },
                { "six", 6 },
                { "seven", 7 },
                { "eight", 8 },
                { "nine", 9 },
            };

            var serializer = new JavaScriptSerializer();

            var digitsInJson = serializer.Serialize(digits);

            Console.WriteLine(digitsInJson);

            var digitsDeserialized = serializer.Deserialize<Dictionary<string, int>>(digitsInJson);

            digitsDeserialized.Print();
        }
    }
}
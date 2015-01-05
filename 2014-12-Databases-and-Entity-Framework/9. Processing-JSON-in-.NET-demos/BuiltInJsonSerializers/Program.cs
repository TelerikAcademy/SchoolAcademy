using System;
using System.Linq;
using System.Web.Script.Serialization;
using System.Collections.Generic;
using DemoModels;

namespace BuiltInJsonSerializers
{
    class Program
    {
        static void Main()
        {
            var serializer = new JavaScriptSerializer();
            
            var place = Place.GetTestPlace();

            var jsonPlace = serializer.Serialize(place);

            Console.WriteLine("JSON STRING: ");
            Console.WriteLine(jsonPlace);


            Console.WriteLine("------------------------------------------------------------");

            Console.WriteLine(place);
            Console.WriteLine(serializer.Deserialize<Place>(jsonPlace));
        }
    }
}
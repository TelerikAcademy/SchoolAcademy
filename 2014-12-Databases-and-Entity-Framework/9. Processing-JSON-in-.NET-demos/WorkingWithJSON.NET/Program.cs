using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using DemoModels;
using Newtonsoft.Json;

namespace WorkingWithJSON.NET
{
    class Program
    {
        static void Main()
        {

            var place = Place.GetTestPlace();
            
            var serializedPlace = JsonConvert.SerializeObject(place);
            //var serializedPlace = JsonConvert.SerializeObject(place, Formatting.Indented);
            Console.WriteLine(serializedPlace);

            var deserializedPlace = JsonConvert.DeserializeObject<Place>(serializedPlace);
        }
    }
}

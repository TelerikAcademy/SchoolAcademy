using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using DemoModels;
using Newtonsoft.Json;

namespace ConfiguringJSON.NET
{
    class Program
    {
        static void Main(string[] args)
        {
            var place = Place.GetTestPlace();

            JsonConvert.SerializeObject(place, Formatting.Indented);


            var json = 
@"{
  'firstName': 'Doncho',
  'lastName': 'Minkov',
  'occupation': 'Technical Trainer'
}";

            var template = new {
                FirstName = "",
                Lastname = "",
                Occupation = ""
            };
            var person = JsonConvert.DeserializeAnonymousType(json, template);
            Console.WriteLine(person);

        }
    }
}

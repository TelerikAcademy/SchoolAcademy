using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using DemoModels;
using Extensions;
using Newtonsoft.Json;

namespace ControllingTheParsing
{
    class Program
    {
        static void Main(string[] args)
        {
            User[] users =
            {
                new User("Minkov", "123456q"),
                new User("Peter", "ObichamLencheto"),
                new User("Ivaylo", "S7ab1lnaPar0la")
            };

            var serializedUsers = JsonConvert.SerializeObject(users, Formatting.Indented);
            Console.WriteLine(serializedUsers);

            var jsonUsers = @"
[
  {
    'username': 'Minkov',
    'password': '654321q'
  },
]";
            var deserializedUsers = JsonConvert.DeserializeObject<IEnumerable<User>>(jsonUsers);           


            deserializedUsers.Select(user => string.Format("Id: {0}, Username: {1}, Password: {2}", user.Id, user.Username, user.Password))
                             .Print();
            //var userToSend = JsonConvert.SerializeObject(user, Formatting.Indented);
            //Console.WriteLine(userToSend);
        }
    }
}
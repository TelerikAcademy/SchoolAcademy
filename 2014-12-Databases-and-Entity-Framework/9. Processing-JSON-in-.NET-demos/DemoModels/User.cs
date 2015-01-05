using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;

namespace DemoModels
{
    public class User
    {
        private static int LastUserId { get; set; }

        public User()
            : this("", "")
        {
        }

        public User(string username, string password)
        {
            this.Id = ++LastUserId;
            this.Username = username;
            this.Password = password;
        }

        static User()
        {
            LastUserId = 0;
        }


        [JsonProperty("id")]
        public int Id { get; set; }

        [JsonProperty("username")]
        public string Username { get; set; }

        [JsonIgnore]
        [JsonProperty("password")]
        public string Password { get; set; }
    }
}

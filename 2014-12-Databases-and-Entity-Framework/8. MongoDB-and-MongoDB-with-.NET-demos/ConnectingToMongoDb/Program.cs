using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using ExtensionsMethods;
using MongoDB.Bson;
using MongoDB.Bson.Serialization.Attributes;
using MongoDB.Driver;
using MongoDB.Driver.Builders;

namespace ConnectingToMongoDb
{
    class Program
    {

        const string DatabaseHost = "mongodb://127.0.0.1";
        const string DatabaseName = "Logger";


        class Log
        {
            [BsonRepresentation(BsonType.ObjectId)]
            public string Id { get; set; }

            public string Text { get; set; }

            public DateTime LogDate { get; set; }
        }

        static MongoDatabase GetDatabase(string name, string fromHost)
        {
            var mongoClient = new MongoClient(fromHost);
            var server = mongoClient.GetServer();
            return server.GetDatabase(name);
        }

        static void Main()
        {
            var db = GetDatabase(DatabaseName, DatabaseHost);

            var logs = db.GetCollection<Log>("Logs");

            logs.Insert(new Log()
            {
                Id = ObjectId.GenerateNewId().ToString(),
                LogDate = DateTime.Now,
                Text = "Something important happened"
            });

            var update = Update.Set("Text", "Changed Text at " + DateTime.Now);


            var query = Query.And(
                Query.LT("LogDate", DateTime.Now.AddSeconds(-1))
                );

            logs.Update(query, update);

            logs.FindAll()
                .Select(l => l.Text)
                .Print();
        }
    }

}

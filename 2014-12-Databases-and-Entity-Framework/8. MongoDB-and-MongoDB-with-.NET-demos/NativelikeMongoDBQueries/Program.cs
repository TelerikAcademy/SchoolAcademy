using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ExtensionsMethods;
using MongoDB.Bson;
using MongoDB.Bson.Serialization.Attributes;
using MongoDB.Driver;
using MongoDB.Driver.Builders;

namespace NativelikeMongoDBQueries
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

            public Log(string text, DateTime logDate)
            {
                this.Id = ObjectId.GenerateNewId().ToString();
                this.Text = text;
                this.LogDate = logDate;
            }

            public override string ToString()
            {
                return string.Format("[{0}] {1}", this.LogDate, this.Text);
            }
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

            IMongoQuery findNewLogsQuery = Query.And(
                Query.GT("LogDate", DateTime.Now.AddDays(-1)));

            var logs = db.GetCollection<Log>("Logs").Find(findNewLogsQuery);

            IMongoQuery findOldLogsQuery = Query.And(
                Query.LT("LogDate", DateTime.Now.AddDays(-1)));

            db.GetCollection<Log>("Logs").Remove(findOldLogsQuery);

            logs.Print();

        }
    }
}

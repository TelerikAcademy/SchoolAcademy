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
using MongoDB.Driver.Linq;

namespace LinqToMongoDB
{
    class EntryPoint
    {
        const string DatabaseHost = "mongodb://127.0.0.1";
        const string DatabaseName = "Logger";

        class LogType
        {
            public string Type { get; set; }

            public string State { get; set; }
        }

        class Log
        {
            [BsonRepresentation(BsonType.ObjectId)]
            public string Id { get; set; }

            public string Text { get; set; }

            public DateTime LogDate { get; set; }

            public LogType LogType { get; set; }

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

        static IEnumerable<Log> CreateSampleLogs(int count)
        {
            var date = DateTime.Now;
            var logs = new List<Log>(count);

            for (var i = 0; i < count; i++)
            {
                var logState = (i % 2 == 0) ? "closed" : "pending";
                var logType = (i % 3 == 0) ? "bug" : (i % 3 == 1) ? "feature-request" : "ticket";
                var text = string.Format("Log  #{0}({1})", i + 1, logType);
                var log = new Log(text, date);
                log.LogType = new LogType()
                {
                    State = logState,
                    Type = logType
                };
                logs.Add(log);
                date = date.AddDays(-1);
            }

            return logs;
        }

        public static void Main()
        {
            var db = GetDatabase(DatabaseName, DatabaseHost);

            var logs = from log in db.GetCollection<Log>("Logs").AsQueryable<Log>()
                       where log.LogType.Type == "ticket" && log.LogType.State == "pending"
                       select log;
            Console.WriteLine(logs.Count());

            logs.Print();
        }
    }
}
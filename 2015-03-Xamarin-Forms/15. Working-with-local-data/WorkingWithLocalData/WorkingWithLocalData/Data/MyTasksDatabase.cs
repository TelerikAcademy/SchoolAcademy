using SQLite.Net;
using System;

using WorkingWithLocalData.Interfaces;
using WorkingWithLocalData.Models;

using Xamarin.Forms;

namespace WorkingWithLocalData.Data
{
    public class MyTasksDatabase
    {
        static object locker = new object();
        private SQLiteConnection database;

        public MyTasksDatabase()
        {
            database = DependencyService.Get<ISQLite>().GetConnection();

            // create tables
            InitializeDatabase();

            this.Tasks = database.Table<Todo>();
        }

        public TableQuery<Todo> Tasks { get; private set; }

        public int Add<T>(T entity) where T : new()
        {
            return this.database.Insert(entity);
        }

        public int Delete<T>(object primaryKey)
        {
            return this.database.Delete<T>(primaryKey);
        }

        public int Update<T>(T item)
        {
            return this.database.Update(item);
        }

        private void InitializeDatabase()
        {
            this.database.CreateTable<Todo>();
        }
    }
}

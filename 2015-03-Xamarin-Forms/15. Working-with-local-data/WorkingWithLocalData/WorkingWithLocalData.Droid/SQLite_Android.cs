using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;

using WorkingWithLocalData.Interfaces;

using SQLite.Net;
using SQLite.Net.Platform.XamarinAndroid;
using Xamarin.Forms;

[assembly: Dependency(typeof(WorkingWithLocalData.Droid.SQLite_Android))]
namespace WorkingWithLocalData.Droid
{
    public class SQLite_Android: ISQLite
    {
        public SQLite_Android() { }
        
        public SQLiteConnection GetConnection()
        {
            var sqliteFilename = "TodoSQLite.db3";
            string documentPath = System.Environment.GetFolderPath(System.Environment.SpecialFolder.Personal);

            var path = System.IO.Path.Combine(documentPath, sqliteFilename);
            //var connString = new SQLiteConnectionString(path, false);

            // create the connection
            //var connection = new SQLiteConnectionWithLock(new SQLitePlatformAndroid(), connString);
            return new SQLiteConnection(new SQLitePlatformAndroid(), path);
        }
    }
}
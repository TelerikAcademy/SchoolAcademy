using System;
using System.IO;

using Foundation;
using UIKit;
using WorkingWithLocalData.Interfaces;
using Xamarin.Forms;

using SQLite.Net;
using SQLite.Net.Platform.XamarinIOS;

[assembly: Dependency(typeof(WorkingWithLocalData.iOS.SQLite_iOS))]
namespace WorkingWithLocalData.iOS
{
    public class SQLite_iOS : ISQLite
    {
        public SQLiteConnection GetConnection()
        {
            var sqliteFilename = "SQLite.db3";
            string documentsPath = Environment.GetFolderPath(Environment.SpecialFolder.Personal);
            string libraryPath = Path.Combine(documentsPath, "..", "Library");

            var path = Path.Combine(libraryPath, sqliteFilename);

            var connection = new SQLiteConnection(new SQLitePlatformIOS(), path);
            return connection;
        }
    }
}
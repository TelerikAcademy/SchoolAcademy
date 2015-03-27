using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Foundation;
using UIKit;
using WorkingWithLocalData.Interfaces;

namespace WorkingWithLocalData.iOS
{
    public class SQLite_iOS: ISQLite
    {
        public SQLite.Net.SQLiteConnection GetConnection()
        {
            throw new NotImplementedException();
        }
    }
}
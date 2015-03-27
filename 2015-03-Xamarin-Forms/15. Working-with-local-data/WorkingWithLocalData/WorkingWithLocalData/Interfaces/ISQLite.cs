using SQLite.Net;

namespace WorkingWithLocalData.Interfaces
{
    public interface ISQLite
    {
        SQLiteConnection GetConnection();
    }
}

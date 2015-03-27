using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WorkingWithLocalData.Data;

namespace WorkingWithLocalData.ViewModels
{
    public class BaseDatabaseViewModel : BaseViewModel
    {
        private MyTasksDatabase database;

        public BaseDatabaseViewModel(MyTasksDatabase database)
        {
            this.database = database;
        }

        public MyTasksDatabase Database
        {
            get { return this.database; }
        }
    }
}

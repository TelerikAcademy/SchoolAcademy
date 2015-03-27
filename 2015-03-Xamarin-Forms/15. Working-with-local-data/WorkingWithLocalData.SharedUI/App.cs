using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using WorkingWithLocalData.Data;
using WorkingWithLocalData.ViewModels;

using Xamarin.Forms;

namespace WorkingWithLocalData.SharedUI
{
    public class App : Application
    {
        private static MyTasksDatabase database;
        public static MyTasksDatabase Database
        {
            get
            {
                if (database == null)
                {
                    database = new MyTasksDatabase();
                }

                return database;
            }
        }

        public App()
        {
            // The root page of your application
            MainPage = new MainPage(new MainPageViewModel(Database));
        }

        protected override void OnStart()
        {
            // Handle when your app starts
        }

        protected override void OnSleep()
        {
            // Handle when your app sleeps
        }

        protected override void OnResume()
        {
            // Handle when your app resumes
        }
    }
}

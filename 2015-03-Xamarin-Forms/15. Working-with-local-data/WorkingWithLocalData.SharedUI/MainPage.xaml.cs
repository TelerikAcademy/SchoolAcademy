using System;

using WorkingWithLocalData.ViewModels;

using Xamarin.Forms;

namespace WorkingWithLocalData.SharedUI
{
    public partial class MainPage : ContentPage
    {
        public MainPage(MainPageViewModel viewModel)
        {
            InitializeComponent();

            this.ViewModel = viewModel;
        }

        void buttonDelete_Clicked(object sender, EventArgs e)
        {
            var button = sender as Button;
            var id = Convert.ToInt32(button.CommandParameter);

            this.ViewModel.Delete(id);
        }

        void buttonEdit_Clicked(object sender, EventArgs e)
        {
            var button = sender as Button;
            if (button == null)
            {
                return;
            }
            var id = Convert.ToInt32(button.CommandParameter);

            StackLayout displayTemplate;
            StackLayout editTemplate;
            GetDisplayAndEditTemplates(button, out displayTemplate, out editTemplate);

            displayTemplate.IsVisible = false;
            editTemplate.IsVisible = true;
        }

        void buttonSave_Clicked(object sender, EventArgs e)
        {
            var button = sender as Button;
            var id = Convert.ToInt32(button.CommandParameter);

            StackLayout displayTemplate;
            StackLayout editTemplate;
            GetDisplayAndEditTemplates(button, out displayTemplate, out editTemplate);

            var todo = new TodoViewModel
            {
                Name = editTemplate.FindByName<Entry>("entryName").Text,
                Notes = editTemplate.FindByName<Entry>("entryNotes").Text,
            };
            this.ViewModel.Update(todo);

            displayTemplate.IsVisible = true;
            editTemplate.IsVisible = false;
        }

        void buttonCancel_Clicked(object sender, EventArgs e)
        {
            var button = sender as Button;
            var id = Convert.ToInt32(button.CommandParameter);

            StackLayout displayTemplate;
            StackLayout editTemplate;
            GetDisplayAndEditTemplates(button, out displayTemplate, out editTemplate);

            displayTemplate.IsVisible = true;
            editTemplate.IsVisible = false;
        }

        public MainPageViewModel ViewModel
        {
            get
            {
                return this.BindingContext as MainPageViewModel;
            }
            set
            {
                this.BindingContext = value;
            }
        }

        private static void GetDisplayAndEditTemplates(Button button, out StackLayout displayTemplate, out StackLayout editTemplate)
        {
            var rootStack = (button.ParentView.ParentView.ParentView as StackLayout);
            displayTemplate = rootStack.FindByName<StackLayout>("displayTemplate");
            editTemplate = rootStack.FindByName<StackLayout>("editTemplate");
        }
    }
}

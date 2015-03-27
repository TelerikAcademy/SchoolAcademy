using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Windows.Input;

using WorkingWithLocalData.Data;
using WorkingWithLocalData.Helpers;
using WorkingWithLocalData.Models;

using Xamarin.Forms;

namespace WorkingWithLocalData.ViewModels
{
    public class MainPageViewModel : BaseDatabaseViewModel
    {
        private ObservableCollection<TodoViewModel> todos;

        public MainPageViewModel(MyTasksDatabase database)
            : base(database)
        {
            this.NewTodo = new TodoViewModel()
            {
                Name = string.Empty,
                Notes = string.Empty
            };

            this.AddTodo = new Command(this.HandleAddNewTodoCommand);
            this.Refresh = new Command(this.HandleRefreshCommand);

            this.LoadTodos();
        }

        public IEnumerable<TodoViewModel> Tasks
        {
            get
            {
                if (this.todos == null)
                {
                    this.todos = new ObservableCollection<TodoViewModel>();
                }
                return this.todos;
            }
            set
            {
                if (this.todos == null)
                {
                    this.todos = new ObservableCollection<TodoViewModel>();
                }

                this.todos.Clear();
                this.todos.AddRange(value);
            }
        }

        public ICommand AddTodo { get; private set; }

        public ICommand Refresh { get; private set; }

        public TodoViewModel NewTodo { get; set; }

        public void Delete(int id)
        {
            base.Database.Delete<Todo>(id);

            var todo = this.todos.FirstOrDefault(t => t.Id == id);
            this.todos.Remove(todo);
        }

        public void Update(TodoViewModel todo)
        {
            var todoModel = todo.ToModel();
            base.Database.Update<Todo>(todoModel);
        }

        private void HandleAddNewTodoCommand()
        {
            // add new model to the database
            Todo todoModel = this.NewTodo.ToModel();
            base.Database.Add<Todo>(todoModel);

            // update the UI
            var newTodo = new TodoViewModel
            {
                Name = this.NewTodo.Name,
                Notes = this.NewTodo.Notes
            };
            this.todos.Add(newTodo);

            // clear input fields
            this.NewTodo.Name = string.Empty;
            this.NewTodo.Notes = string.Empty;
        }

        private void HandleRefreshCommand()
        {
            this.LoadTodos();
        }

        private void LoadTodos()
        {
            this.Tasks = base.Database.Tasks.AsQueryable()
                .Select(TodoViewModel.FromModel);
        }
    }
}

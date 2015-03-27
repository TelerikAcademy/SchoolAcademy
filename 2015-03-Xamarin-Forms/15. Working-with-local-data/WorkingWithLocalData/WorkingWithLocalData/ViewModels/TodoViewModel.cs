using System;
using System.Linq;
using System.Linq.Expressions;
using WorkingWithLocalData.Models;

namespace WorkingWithLocalData.ViewModels
{

    public class TodoViewModel : BaseViewModel
    {
        private int id;
        private string name;
        private string notes;
        private bool done;

        public static Expression<Func<Todo, TodoViewModel>> FromModel
        {
            get
            {
                return t => new TodoViewModel()
                {
                    Id = t.Id,
                    Name = t.Name,
                    Notes = t.Notes,
                    Done = t.Done
                };
            }
        }

        public int Id
        {
            get { return this.id; }
            set
            {
                if (this.id == value) { return; }
                this.id = value;
                OnPropertyChanged();
            }
        }

        public string Name
        {
            get { return this.name; }
            set
            {
                if (this.name == value) { return; }
                this.name = value;
                OnPropertyChanged();
            }
        }

        public string Notes
        {
            get { return this.notes; }
            set
            {
                if (this.notes == value) { return; }
                this.notes = value;
                OnPropertyChanged();
            }
        }

        public bool Done
        {
            get { return this.done; }
            set
            {
                if (this.done == value) { return; }
                this.done = value;
                OnPropertyChanged();
            }
        }

        public Todo ToModel()
        {
            return new Todo
            {
                Name = this.Name,
                Notes = this.Notes,
            };
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DemoModels
{
    public class Place
    {
        private List<Category> categories;

        public Place()
        {
            this.categories = new List<Category>();
        }

        public string Name { get; set; }

        public override string ToString()
        {
            return string.Format("categories: {0}, Name: {1}, Categories: {2}, Location: {3}", categories, Name, Categories, Location);
        }

        public override int GetHashCode()
        {
            unchecked
            {
                int result = 17;
                result = result * 23 + ((categories != null) ? this.categories.GetHashCode() : 0);
                result = result * 23 + ((Name != null) ? this.Name.GetHashCode() : 0);
                result = result * 23 + ((Location != null) ? this.Location.GetHashCode() : 0);
                return result;
            }
        }

        public bool Equals(Place value)
        {
            if (ReferenceEquals(null, value))
            {
                return false;
            }
            if (ReferenceEquals(this, value))
            {
                return true;
            }
            return this.categories.Intersect(value.Categories).Count() == this.categories.Count &&
                   Equals(this.Name, value.Name) &&
                   Equals(this.Location, value.Location);
        }

        public override bool Equals(object obj)
        {
            Place temp = obj as Place;
            if (temp == null)
                return false;
            return this.Equals(temp);
        }

        public IEnumerable<Category> Categories
        {
            get
            {
                return this.categories;
            }
            set
            {
                this.categories.Clear();
                foreach (var item in value)
                {
                    this.categories.Add(item);
                }
            }
        }
        
        public Location Location { get; set; }


        public static Place GetTestPlace()
        {
            return new Place
            {
                Name = "Pri Ivan",
                Categories = new Category[] { Category.Get("food"), Category.Get("drinks") },
                Location = new Location(42.6975100, 23.3241500)
            };
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DemoModels
{
    public class Category
    {
        public override string ToString()
        {
            return string.Format("Id: {0}, Name: {1}", Id, Name);
        }

        static Category()
        {
            LastCategoryId = 0;
            Categories = new Dictionary<string, Category>();
        }

        private static int LastCategoryId { get; set; }
        private static Dictionary<string,Category> Categories { get; set; }

        public static Category Get(string categoryName)
        {
            var categoryNameToLower = categoryName.ToLower();
            if (!(Categories.ContainsKey(categoryNameToLower)))
            {
                Categories[categoryNameToLower] = new Category
                {
                    Id = ++LastCategoryId,
                    Name = categoryName
                };
            }
            return Categories[categoryNameToLower];
        }

        public int Id { get; set; }

        public object Name { get; set; }
    }
}

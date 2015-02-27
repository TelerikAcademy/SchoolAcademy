namespace StamatShop.Models
{
    using System;
    using System.Collections.Generic;
    using System.Linq;

    public class Category
    {
        public Category()
        {
            this.Products = new HashSet<Product>();
        }

        public int Id { get; set; }

        public string Name { get; set; }

        public ICollection<Product> Products { get; set; }
    }
}

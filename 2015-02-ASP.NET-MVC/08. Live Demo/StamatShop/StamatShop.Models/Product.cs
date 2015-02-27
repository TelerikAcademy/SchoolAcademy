namespace StamatShop.Models
{
    using System;
    using System.Collections.Generic;

    public class Product
    {
        public int Id { get; set; }

        public string Name { get; set; }

        public string Description { get; set; }

        public int Rating { get; set; }

        public decimal Price { get; set; }

        public virtual Category Category { get; set; }
    }
}

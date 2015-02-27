namespace StamatShop.Web.ViewModels
{
    using StamatShop.Models;
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.Linq;
    using System.Linq.Expressions;

    public class ProductViewModel
    {
        public int Id { get; set; }

        [Required]
        public string Name { get; set; }

        public string Description { get; set; }
        
        public int Rating { get; set; }

        [Required]
        public decimal Price { get; set; }

        public CategoryViewModel Category { get; set; }

        public static Expression<Func<Product, ProductViewModel>> FromModel()
        {
            return x => new ProductViewModel()
            {
                Id = x.Id,
                Name = x.Name,
                Description = x.Description,
                Price = x.Price,
                Rating = x.Rating,
                Category = new CategoryViewModel
                {
                    Id = x.Category.Id,
                    Name = x.Category.Name
                }
            };
        }
    }
}

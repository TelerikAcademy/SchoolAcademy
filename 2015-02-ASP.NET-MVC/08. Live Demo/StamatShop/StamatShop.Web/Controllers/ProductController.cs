using StamatShop.Models;
using StamatShop.Web.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace StamatShop.Web.Controllers
{
    [Authorize]
    public class ProductController : BaseController
    {
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult Details(int id)
        {
            var prod = this.DbContext.Products
                .FirstOrDefault(x => x.Id == id);

            var prodVM = new ProductViewModel
            {
                Id = prod.Id,
                Name = prod.Name,
                Description = prod.Description,
                Price = prod.Price,
                Rating = prod.Rating,
                Category = new CategoryViewModel
                {
                    Id = prod.Category.Id,
                    Name = prod.Category.Name,
                }
            };

            return View(prodVM);
        }

        [HttpGet]
        public ActionResult Add()
        {
            ViewBag.Categories = GetCategoriesList();
            return View();
        }

        private IEnumerable<SelectListItem> GetCategoriesList()
        {
            var categoryList = this.DbContext.Categories.Select(x => new SelectListItem
            {
                Text = x.Name,
                Value = x.Id.ToString()
            }).ToList();

            return categoryList;
        }

        [HttpPost]
        public ActionResult Add(ProductViewModel prod)
        {
            if (!ModelState.IsValid)
            {
                ViewBag.Categories = GetCategoriesList();
                return View(prod);
            }

            Product newProd = new Product()
            {
                Name = prod.Name,
                Description = prod.Description,
                Price = prod.Price,
                Rating = prod.Rating,
                Category = this.DbContext.Categories
                    .FirstOrDefault(x => x.Id == prod.Category.Id)
            };

            this.DbContext.Products.Add(newProd);
            this.DbContext.SaveChanges();

            return RedirectToAction("Index", "Home");
        }

        [HttpGet]
        public ActionResult Edit(int id)
        {
            var prod = this.DbContext.Products.Find(id);

            var prodVM = new ProductViewModel
            {
                Id = prod.Id,
                Name = prod.Name,
                Description = prod.Description,
                Price = prod.Price,
                Rating = prod.Rating,
                Category = new CategoryViewModel
                {
                    Id = prod.Category.Id,
                    Name = prod.Category.Name,
                }
            };

            ViewBag.Categories = GetCategoriesList();
            return View(prodVM);
        }

        [HttpPost]
        public ActionResult Edit(ProductViewModel prod)
        {
            if (!ModelState.IsValid)
            {
                ViewBag.Categories = GetCategoriesList();
                return View(prod);
            }
            
            var oldProd = this.DbContext.Products.Find(prod.Id);
            oldProd.Name = prod.Name;
            oldProd.Description = prod.Description;
            oldProd.Price = prod.Price;
            oldProd.Rating = prod.Rating;
            oldProd.Category = this.DbContext.Categories.FirstOrDefault(x => x.Id == prod.Category.Id);

            this.DbContext.SaveChanges();

            return RedirectToAction("Index", "Home");
        }
    }
}
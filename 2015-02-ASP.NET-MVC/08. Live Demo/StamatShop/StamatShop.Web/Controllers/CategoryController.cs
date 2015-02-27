using StamatShop.Web.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace StamatShop.Web.Controllers
{
    public class CategoryController : BaseController
    {
        // GET: Categories
        public ActionResult GetCategoryProducts(string categoryName)
        {
            var products = this.DbContext.Products
                .Where(x => x.Category.Name == categoryName)
                .Select(ProductViewModel.FromModel()).ToList();

            return View(products);
        }
    }
}
namespace StamatShop.Web.Controllers
{
    using StamatShop.Data;
    using System.Web.Mvc;

    public abstract class BaseController : Controller
    {
        public BaseController()
        {
            this.DbContext = new StamatDbContext();
        }

        public StamatDbContext DbContext { get; set; }
    }
}
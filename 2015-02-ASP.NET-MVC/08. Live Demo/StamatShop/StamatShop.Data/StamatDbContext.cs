using Microsoft.AspNet.Identity.EntityFramework;
using StamatShop.Data.Migrations;
using StamatShop.Models;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StamatShop.Data
{
    public class StamatDbContext : IdentityDbContext<ApplicationUser>
    {
        public StamatDbContext()
            : base("DefaultConnection", throwIfV1Schema: false)
        {
            Database.SetInitializer(
                new MigrateDatabaseToLatestVersion<StamatDbContext, Configuration>());
        }

        public static StamatDbContext Create()
        {
            return new StamatDbContext();
        }

        public IDbSet<Product> Products { get; set; }

        public IDbSet<Category> Categories { get; set; }
    }
}

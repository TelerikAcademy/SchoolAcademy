using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(StamatShop.Web.Startup))]
namespace StamatShop.Web
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}

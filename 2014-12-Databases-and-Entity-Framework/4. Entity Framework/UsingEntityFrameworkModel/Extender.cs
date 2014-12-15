using System;
using System.Linq;

namespace UsingEntityFrameworkModel
{
    public partial class Product
    {
        public override string ToString()
        {
            return string.Format("{0} by {1}\n costs {2}", this.ProductName, this.Supplier, this.UnitPrice);
        }
    }

    public partial class Supplier
    {
        public override string ToString()
        {
            return this.CompanyName;
        }
    }
}

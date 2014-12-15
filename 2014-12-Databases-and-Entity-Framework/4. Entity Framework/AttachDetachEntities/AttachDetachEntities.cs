using System.Linq;
using UsingEntityFrameworkModel;
using System;
using System.Data.Entity.Infrastructure;

class AttachDetachEntities
{
    static void Main()
    {
        var product = GetProduct(1);
        Console.WriteLine(product.ProductName);

        UpdateProduct(product, product.ProductName + "1");

        var updatedProduct = GetProduct(1);
        Console.WriteLine(updatedProduct.ProductName);

        PlayWithDetatch();
    }

    static Product GetProduct(int id)
    {
        using (NorthwindEntities northwindEntities = new NorthwindEntities())
        {
            Product product = northwindEntities.Products.First(p => p.ProductID == id);
            return product;
        }
    }

    static void UpdateProduct(Product product, string newName)
    {
        using (NorthwindEntities northwindEntities = new NorthwindEntities())
        {
            northwindEntities.Products.Attach(product); // This line is required!
            product.ProductName = newName;
            northwindEntities.SaveChanges();
        }
    }

    static void PlayWithDetatch()
    {
        NorthwindEntities northwindEntities = new NorthwindEntities();
        Product newProduct = new Product
        {
            ProductName = "new product",
            Discontinued = false,
            CategoryID = 3
        };
        northwindEntities.Products.Add(newProduct);
        northwindEntities.SaveChanges();

        // Now the product is stored in the database. Let's print its category

        Console.WriteLine(newProduct.Category); // prints "null"

        // Find the product by primary key --> returns the same object (unmodified)
        // Still prints "null" (due to caching and identity resolution)
        var productByPK = northwindEntities.Products.Find(newProduct.ProductID);
        Console.WriteLine(productByPK.Category); // null (due to caching)

        // Find the product by query still uses "identity resolution" (caching)
        var productFromDb = 
            (from prod in northwindEntities.Products
             where prod.ProductID == newProduct.ProductID
             select prod).FirstOrDefault();
        Console.WriteLine(productFromDb.Category); // null (due to caching)

        // Detach the object from the context --> remove it from the cache
        ((IObjectContextAdapter)northwindEntities).ObjectContext.Detach(newProduct);
        
        // This change will not be tracked by the context
        newProduct.ProductName = "Changed name";

        // This will make no changes in the DB (detatched objects are not tracked)
        northwindEntities.SaveChanges();

        // Now find the product by primary key (detached entities are not cached)
        var detachedProductByPK = northwindEntities.Products.Find(newProduct.ProductID);
        Console.WriteLine(detachedProductByPK.Category); // works (no caching)
    }
}

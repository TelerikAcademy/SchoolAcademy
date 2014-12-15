using System.Linq;
using UsingEntityFrameworkModel;
using System;

class UpdatingDeletingInsertingData
{
	static void Main()
	{
		Console.WriteLine("Program started.");
		PrintLastFiveProducts();
			
		int newProductId = CreateNewProduct("newProduct");
		Console.WriteLine("Created new product.");
		PrintLastFiveProducts();
			
		ModifyProductName(newProductId, "new name " + DateTime.Now.Ticks);
		Console.WriteLine("Modified the product {0}.", newProductId);
		PrintLastFiveProducts();

		Console.WriteLine("Deleted the product {0}.", newProductId);
		DeleteProduct(newProductId);
		PrintLastFiveProducts();
	}

	static void PrintLastFiveProducts()
	{
		NorthwindEntities northwindEntities = new NorthwindEntities();
		var lastFiveProducts =
			(from p in northwindEntities.Products
			orderby p.ProductID descending
			select p).Take(5);
		Console.WriteLine("Last 5 products:");
		foreach (var product in lastFiveProducts)
		{
			Console.WriteLine("{0}. {1}", product.ProductID, product.ProductName);
		}
		Console.WriteLine();
	}

	static int CreateNewProduct(string productName)
    {
		NorthwindEntities northwindEntities = new NorthwindEntities();
		Product newProduct = new Product
		{
            ProductName = productName,
            Discontinued = false
        };
        northwindEntities.Products.Add(newProduct);
		northwindEntities.SaveChanges();
		return newProduct.ProductID;
    }

	static void ModifyProductName(int productId, string newName)
	{
		NorthwindEntities northwindEntities = new NorthwindEntities();
		Product product = GetProductById(northwindEntities, productId);
		product.ProductName = newName;
		northwindEntities.SaveChanges();
	}

	static void DeleteProduct(int productId)
    {
		NorthwindEntities northwindEntities = new NorthwindEntities();
		Product product = GetProductById(northwindEntities, productId);
        northwindEntities.Products.Remove(product);
		northwindEntities.SaveChanges();
    }

    static Product GetProductById(NorthwindEntities northwindEntities, int productId)
    {
		Product product = northwindEntities.Products.FirstOrDefault(
			p => p.ProductID == productId);
		return product;
    }
}

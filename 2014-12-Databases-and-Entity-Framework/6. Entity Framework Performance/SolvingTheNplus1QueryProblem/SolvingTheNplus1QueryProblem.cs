using System;
using ResolvingTheNplus1QueryProblem;

class SolvingTheNplus1QueryProblem
{
	static void Main()
	{
        NorthwindEntities northwindEntities = new NorthwindEntities();
        PrintCustomersAndRegionsWithQueryProblem(northwindEntities);
		PrintCustomersAndRegionsWithoutQueryProblem(northwindEntities);
	}

	static void PrintCustomersAndRegionsWithQueryProblem(NorthwindEntities context)
    {
        foreach (var product in context.Products)
        {
            Console.WriteLine("Product: {0}; Supplier: {1}; Category: {2}",
                product.ProductName, product.Supplier.CompanyName,
                product.Category.CategoryName);
        }
    }

	static void PrintCustomersAndRegionsWithoutQueryProblem(NorthwindEntities context)
    {
        foreach (var product in context.Products.Include("Supplier").Include("Category"))
        {
            Console.WriteLine("Product: {0}; Supplier: {1}; Category: {2}",
                product.ProductName, product.Supplier.CompanyName,
                product.Category.CategoryName);
        }
    }
}

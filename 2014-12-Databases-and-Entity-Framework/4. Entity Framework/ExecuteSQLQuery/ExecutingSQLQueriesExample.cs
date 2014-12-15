using System;
using System.Linq;
using UsingEntityFrameworkModel;
using System.Collections.Generic;

class ExecutingSQLQueriesExample
{
    static void Main()
    {
		int customersCount = SelectCustomersCount();
		Console.WriteLine("Customers count: {0}", customersCount);

		Console.WriteLine("\nList of products:");
		var products = SelectTop5ProductsIdAndName();
		foreach (var product in products)
		{
			Console.WriteLine("{0}. {1}", product.ID, product.Name);
		}

		Console.WriteLine("\nList of employees from London:");
		var employees = SelectEmployeeNamesByCountryAndCity("UK", "London");
		foreach (var emp in employees)
		{
			Console.WriteLine(emp);
		}
	}

	static int SelectCustomersCount()
	{
		NorthwindEntities northwindEntities = new NorthwindEntities();
		string nativeSqlQuery = "SELECT count(*) FROM dbo.Customers";
        var queryResult = northwindEntities.Database.SqlQuery<int>(nativeSqlQuery);
		int customersCount = queryResult.FirstOrDefault();
		return customersCount;
	}

	static IEnumerable<ProductIdAndName> SelectTop5ProductsIdAndName()
	{
		NorthwindEntities northwindEntities = new NorthwindEntities();
		string nativeSqlQuery = 
			"SELECT TOP 5 ProductID as ID, ProductName as Name " +
			"FROM dbo.Products " +
			"ORDER BY ProductID";
		var products =
            northwindEntities.Database.SqlQuery<ProductIdAndName>(nativeSqlQuery);
		return products;
	}

	private static IEnumerable<string> SelectEmployeeNamesByCountryAndCity(
		string country, string city)
	{
		NorthwindEntities northwindEntities = new NorthwindEntities();
		string nativeSqlQuery =
			"SELECT FirstName + ' ' + LastName " +
			"FROM dbo.Employees " +
			"WHERE Country = {0} AND City = {1}";
		object[] parameters = { country, city };
        var employees = northwindEntities.Database.SqlQuery<string>(
			nativeSqlQuery, parameters);
		return employees;
	}

	class ProductIdAndName
	{
		public int ID { get; set; }
		public string Name { get; set; }
	}
}

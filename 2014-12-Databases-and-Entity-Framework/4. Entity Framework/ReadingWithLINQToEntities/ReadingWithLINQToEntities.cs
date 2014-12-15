using System.Linq;
using System;
using UsingEntityFrameworkModel;

class ReadingWithLINQToEntities
{
	static void Main()
	{
		SelectFromSingleTable();
		SelectFromMultipleTables();
	}

	private static void SelectFromSingleTable()
	{
		NorthwindEntities northwindEntities = new NorthwindEntities();

		// Select data from sinlge table
		IQueryable<Customer> customers =
			from c in northwindEntities.Customers
			where c.City == "London"
			select c;

		Logger.PrintQueries(customers);

		Console.WriteLine("The query is still not generated and executed.");
		foreach (var item in customers)
		{
			Console.WriteLine("Company: {0}, Phone: {1}",
				item.CompanyName, item.Phone);
		}
	}

	private static void SelectFromMultipleTables()
	{
		NorthwindEntities northwindEntities = new NorthwindEntities();

		// Perform database SELECT from Orders joined to Customers
		var orders =
			from o in northwindEntities.Orders
			where o.Customer.Country == "UK"
			select o;

		Logger.PrintQueries(orders);

		foreach (var item in orders)
		{
			Console.WriteLine("Order Dates To UK: {0}",
				item.OrderDate.Value.ToShortDateString());
		}
	}
}
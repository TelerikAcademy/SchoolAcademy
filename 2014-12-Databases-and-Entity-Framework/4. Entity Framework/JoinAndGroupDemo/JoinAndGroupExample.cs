using System.Linq;
using UsingEntityFrameworkModel;
using System;

class JoinAndGroupExample
{
	static void Main()
	{
		NorthwindEntities northwindEntities = new NorthwindEntities();
		JoinCustomerWithSupplier(northwindEntities);
		JoinCustomerWithSupplierExtentedMethods(northwindEntities);
		GroupCustomersByCountry(northwindEntities);
		GroupCustomersByCountryExtentedMethods(northwindEntities);
	}
	
	static void JoinCustomerWithSupplier(NorthwindEntities northwindEntities)
    {
        var customerSupplier = 
			from customer in northwindEntities.Customers
            join supplier in northwindEntities.Suppliers
            on customer.Country equals supplier.Country
            select new 
			{ 
				CustomerName = customer.CompanyName, 
				Supplier = supplier.CompanyName, 
                Country = customer.Country 
			};
        Logger.PrintQueries(customerSupplier);
		foreach (var item in customerSupplier)
		{
			Console.WriteLine(item);
		}
    }
        
    static void JoinCustomerWithSupplierExtentedMethods(NorthwindEntities northwindEntities)
    {
        var customerSupplier = 
        northwindEntities.Customers.Join(
			northwindEntities.Suppliers,
            (customer=>customer.Country),
            (supplier=>supplier.Country),
            (customer,supplier)=> new
			{ 
				CustomerName = customer.CompanyName, 
                Supplier = supplier.CompanyName, 
                Country = customer.Country
			});
        Logger.PrintQueries(customerSupplier);
		foreach (var item in customerSupplier)
		{
			Console.WriteLine(item);
		}
    }

    static void GroupCustomersByCountry(NorthwindEntities northwindEntities)
    {
        var groupedCustomers = 
			from customer in northwindEntities.Customers
            group customer by customer.Country;

        Logger.PrintQueries(groupedCustomers);
		foreach (var group in groupedCustomers)
		{
			Console.WriteLine(group.Key);
			foreach (var item in group)
			{
				Console.WriteLine(item.CompanyName);
			}
			Console.WriteLine(Logger.SeparatorLine);
		}
    }

    static void GroupCustomersByCountryExtentedMethods(NorthwindEntities northwindEntities)
    {
        var groupedCustomers = 
			northwindEntities.Customers.GroupBy(customer => customer.Country);
        Logger.PrintQueries(groupedCustomers);
		foreach (var group in groupedCustomers)
		{
			Console.WriteLine(group.Key);
			foreach (var item in group)
			{
				Console.WriteLine(item.CompanyName);
			}
			Console.WriteLine(Logger.SeparatorLine);
		}
    }
}

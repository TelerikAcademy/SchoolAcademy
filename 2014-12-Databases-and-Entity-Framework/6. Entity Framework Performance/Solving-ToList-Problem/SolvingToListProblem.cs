using System;
using System.Linq;
using Solving_ToList_Problem;
using System.Collections.Generic;

class SolvingToListProblem
{
    static void Main()
    {
        ShowCustomersPurchasedFromTokyo_Slow();
        ShowCustomersPurchasedFromTokyo_Fast();
    }

    private static void ShowCustomersPurchasedFromTokyo_Slow()
    {
        NorthwindEntities northwindEntities = new NorthwindEntities();
        List<Order_Detail> orderItemsFromTokyo =
            northwindEntities.Order_Details.ToList().
            Where(od => od.Product.Supplier.City == "Tokyo").ToList();
        List<Customer> customerPurchasedFromTokyo =
            orderItemsFromTokyo.Select(oi => oi.Order.Customer).ToList();
        foreach (var customer in customerPurchasedFromTokyo)
        {
            Console.WriteLine(customer.ContactName);
        }
    }

    private static void ShowCustomersPurchasedFromTokyo_Fast()
    {
        NorthwindEntities northwindEntities = new NorthwindEntities();
        List<Customer> customerPurchasedFromTokyo =
            (from orderItem in northwindEntities.Order_Details
             where orderItem.Product.Supplier.City == "Tokyo"
             select orderItem.Order.Customer).ToList();
        foreach (var customer in customerPurchasedFromTokyo)
        {
            Console.WriteLine(customer.ContactName);
        }
    }
}

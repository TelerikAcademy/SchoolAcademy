using System;
using System.Collections.Generic;
using System.Linq;

class BinarySearch
{
    static Random rand = new Random();

    static void Main()
    {
        string[] beers =
        {
            "Zagorka", "Ariana", "Shumensko", "Astika",
            "Kamenitza", "Bolyarka", "Amstel"
        };
        Array.Sort(beers);

        string target = "Astika";
        int index = Array.BinarySearch(beers, target);
        Console.WriteLine("{0} is found at index {1}.", target, index);
        // Result: Astika is found at index 2.

        target = "Heineken";
        index = Array.BinarySearch(beers, target);
        Console.WriteLine("{0} is not found (index={1}).", target, index);
        // Result: Heineken is not found (index=-5).

        //load test

        string line = Console.ReadLine();
        int n = int.Parse(line);
        byte[] array = new byte[n];

        for (int i = 0; i < n; i++)
        {
            array[i] = (byte)(i % byte.MaxValue);
        }

        Array.Sort(array);

        DateTime start = DateTime.Now;
        foreach (var element in array)
        {
            Array.IndexOf(array, element);
        }
        DateTime end = DateTime.Now;

        Console.WriteLine("IndexOf: {0}", end - start);

        start = DateTime.Now;
        foreach (var element in array)
        {
            Array.BinarySearch(array, element);
        }
        end = DateTime.Now;

        Console.WriteLine("BinarySearch: {0}", end - start);
    }
}
using System;
using System.Collections.Generic;

class Lists
{
    static void Main(string[] args)
    {
        List<string> listOfStrings = new List<string>();
        string[] arrayOfStrings = { "Pesho", "Ivan", "Dobri", "Gosho" };
        foreach (string str in arrayOfStrings)
        {
            listOfStrings.Add(str);
        }

        Console.WriteLine("Using \"foreach\" loop to traverse the List");
        Console.WriteLine(new string('-', 20));
        foreach (string str in listOfStrings)
        {
            Console.WriteLine(str);
        }

        Console.WriteLine(new string('-', 50));
        Console.WriteLine("Using \"for\" loop to traverse the List");
        Console.WriteLine(new string('-', 20));
        for (int i = 0; i < listOfStrings.Count; i++)
        {
            Console.WriteLine(listOfStrings[i]);
        }
        Console.WriteLine();
    }
}

using System;

class SplittingStrings
{
    static void Main()
    {
        string listOfBeers = "Amstel, Zagorka, Tuborg, Becks.";
        string[] beers = listOfBeers.Split(' ', ',', '.');
        //string[] beers = listOfBeers.Split(
        //    new char[] {' ', ',', '.'}, 
        //    StringSplitOptions.RemoveEmptyEntries);
        Console.WriteLine("Available beers are:");
        foreach (string beer in beers)
        {
            // Two sequential separators in the input cause
            // presence of empty element in the result
            if (beer != "")
            {
                Console.WriteLine(beer);
            }
        }
    }
}

using System;

class ReadingPrintingStrings
{
    static void Main()
    {
        string[] towns = {"Sofia", "Varna", "Plovdiv",
			"Pleven", "Bourgas", "Rousse", "Stara Zagora",
			"Veliko Tarnovo", "Yambol", "Sliven"};
        string firstTown = towns[0];
        for (int i = 1; i < towns.Length; i++)
        {
            string currentTown = towns[i];
            if (String.Compare(currentTown, firstTown) < 0)
            {
                firstTown = currentTown;
            }
        }
        Console.WriteLine("First town: {0}", firstTown);
    }
}

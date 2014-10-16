using System;

class PrintingLetter
{
    static void Main()
    {
        Console.Write("Enter person name: ");
        string person = Console.ReadLine();

        Console.Write("Enter company name: ");
        string company = Console.ReadLine();

        Console.WriteLine("  Dear {0},", person);
        Console.WriteLine(
			"We are pleased to tell you " +
            "that {0} has chosen you to take part " +
            "in the \"Introduction To Programming\" " +
            "course. {0} wishes you good luck!",
            company);

        Console.WriteLine("  Yours,");
        Console.WriteLine("  {0}", company);
    }
}

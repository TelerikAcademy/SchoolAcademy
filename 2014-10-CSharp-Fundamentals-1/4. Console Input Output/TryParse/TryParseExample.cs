using System;

class TryParseExample
{
    static void Main()
    {
        string str = Console.ReadLine();
        int number;
        if (int.TryParse(str, out number))
        {
            Console.WriteLine("Valid number: {0}", number);
        }
        else
        {
            Console.WriteLine("Invalid number: {0}", str);
        }
    }
}

using System;

class IfElseStatement
{
    static void Main()
    {
        Console.Write("Please enter a number: ");
        int number = int.Parse(Console.ReadLine());

        if (number % 2 == 0)
        {
            Console.WriteLine("This number is even.");
        }
        else
        {
            Console.WriteLine("This number is odd.");
        }
    }
}

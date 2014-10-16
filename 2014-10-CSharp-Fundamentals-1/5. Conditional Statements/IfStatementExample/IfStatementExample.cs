using System;

class IfStatementExample
{
    static void Main()
    {
        Console.WriteLine("Please enter two numbers (on separate lines).");

        int firstNumber = int.Parse(Console.ReadLine());
        int secondNumber = int.Parse(Console.ReadLine());

        int biggerNumber = firstNumber;
        if (secondNumber > firstNumber)
        {
            biggerNumber = secondNumber;
        }

        Console.WriteLine("The bigger number is: {0}", biggerNumber);
    }
}

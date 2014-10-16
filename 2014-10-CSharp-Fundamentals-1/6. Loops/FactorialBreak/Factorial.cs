using System;

class Factorial
{
    static void Main()
    {
        Console.Write("n = ");
        string consoleInputLine = Console.ReadLine();
        int n = Convert.ToInt32(consoleInputLine);

        Console.Write("n! = ");
		
        // "decimal" is the biggest integer type
        decimal factorial = 1;

        // Perform an infinite loop
        while (true)
        {
            Console.Write(n); 
            if (n == 1) 
            {
                break;
            }
            Console.Write(" * ");
            factorial *= n;
            n--;
        }
        Console.WriteLine(" = {0}", factorial);
    }
}


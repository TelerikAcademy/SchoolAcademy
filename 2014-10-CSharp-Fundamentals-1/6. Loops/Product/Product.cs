using System;

class Product
{
    static void Main()
    {
        Console.Write("n = ");
        string consoleInputLine = Console.ReadLine();
        int n = int.Parse(consoleInputLine);
        Console.Write("m = ");
        consoleInputLine = Console.ReadLine();
        int m = int.Parse(consoleInputLine);

        if (n < m)
        {
            int num = n;
            decimal product = 1;
            do
            {		
                product *= num;
                num++;
            }
            while(num <= m);

            Console.WriteLine("product[n..m] = " + product);
        }
        else
        {
            Console.WriteLine("Error: n should be smaller than m.");
        }
    }
}

using System;

class ForLoops
{
    static void Main()
    {
        for (int num = 0; num < 10; num++)
        {
            Console.Write(num + " ");
        }
        Console.WriteLine();
        Console.WriteLine();

        int n = 5;
        decimal factorial = 1;
        for (int i = 1; i <= n; i++)
        {
            factorial *= i;
        }
        Console.WriteLine("{0}! = {1}", n, factorial);
        Console.WriteLine();

        for (int i = 1, sum = 1; i <= 128; i = i * 2, sum += i)
        {
            Console.WriteLine("i={0}, sum={1}", i, sum);
        }
        Console.WriteLine();
    }
}

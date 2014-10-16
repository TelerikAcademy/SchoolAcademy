using System;

class ReadingNumbers
{
    static void Main()
    {
        Console.Write("a = ");
        string line = Console.ReadLine();

        int a = int.Parse(line);

        Console.Write("b = ");
        line = Console.ReadLine();
        int b = int.Parse(line);

        Console.WriteLine("{0} + {1} = {2}",
			a, b, a + b);
        Console.WriteLine("{0} * {1} = {2}",
			a, b, a * b);

        Console.Write("f = ");
        line = Console.ReadLine();
        float f = float.Parse(line);
        Console.WriteLine("{0} * {1} / {2} = {3}",
			a, b, f, a * b / f);
    }
}

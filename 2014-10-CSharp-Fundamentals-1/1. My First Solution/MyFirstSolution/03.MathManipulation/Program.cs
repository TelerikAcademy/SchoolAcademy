using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Abs of the number -7 is {0}", Math.Abs(-7));
        Console.WriteLine("Square of 9 is {0}", Math.Sqrt(9));
        Console.WriteLine("Square of 10 is {0}", Math.Sqrt(10));
        Console.WriteLine("PI is {0}", Math.PI);

        int width = 10;
        int height = 4;
        int area = width * height;
        Console.WriteLine("The area of rectangle with width = 10 and height = 4 is {0}", area);
    }
}


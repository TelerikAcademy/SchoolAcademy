using System;

class DynamicTypes
{
    static void Main()
    {
        dynamic a = 5;
        dynamic b = 3;
        // + here means sum of integers
        Console.WriteLine(a + b);

        a = "5";
        b = 3;
        // + here means string concatenation
        Console.WriteLine(a + b);
    }
}

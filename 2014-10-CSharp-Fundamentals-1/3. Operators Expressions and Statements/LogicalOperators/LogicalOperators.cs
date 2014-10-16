using System;

class LogicalOperators
{
	static void Main()
	{
        bool a = true;
        bool b = false;
        Console.WriteLine(a && b); // False
        Console.WriteLine(a || b); // True
        Console.WriteLine(a ^ b); // True
        Console.WriteLine(!b); // True
        Console.WriteLine(b || true); // True
        Console.WriteLine(b && true); // False
        Console.WriteLine(a || true); // True
        Console.WriteLine(a && true); // True
        Console.WriteLine(!a); // False
        Console.WriteLine((5 > 7) ^ (a == b)); // False
	}
}

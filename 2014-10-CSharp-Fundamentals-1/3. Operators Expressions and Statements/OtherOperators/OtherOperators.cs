using System;

class OtherOperators
{
	static void Main()
	{
        string first = "First";
        string second = "Second";
        Console.WriteLine(first + second); // FirstSecond
        
        string output = "The number is : ";
        int number = 5;
        Console.WriteLine(output + number); // The number is : 5

        int a = 6;
		int b = 4;
		Console.WriteLine(a > b ? "a > b" : "b >= a"); // a>b
		Console.WriteLine((int) a); // 6

		int c=b=3; // b=3 and c=3
		Console.WriteLine(c); // 3
		
        Console.WriteLine(a is int); // True
		Console.WriteLine((a + b) / 2); // 4
		Console.WriteLine(typeof(int)); // System.Int32

		int d = new int();
		Console.WriteLine(d); // 0


        int? x = null;
        int y = x ?? 5;

        Console.WriteLine(y);
        string strPesho = "Pesho";
        string finalStr = strPesho ?? "[Empty]";
        Console.WriteLine(finalStr);


		Console.WriteLine( (a+b) / d); // DivideByZeroException


	}
}

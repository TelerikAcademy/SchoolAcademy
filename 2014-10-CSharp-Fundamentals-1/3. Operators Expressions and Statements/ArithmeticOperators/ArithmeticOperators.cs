using System;

class ArithmeticOperators
{
	static void Main()
	{
        int squarePerimeter = 17;
        double squareSide = squarePerimeter / 4.0;
        double squareArea = squareSide * squareSide;
        Console.WriteLine(squareSide); // 4.25
        Console.WriteLine(squareArea); // 18.0625
        
        int a = 5;
        int b = 4;
        Console.WriteLine(a + b); // 9
        Console.WriteLine(a + b++); // 9
        Console.WriteLine(a + b); // 10
        Console.WriteLine(a + (++b)); // 11
        Console.WriteLine(a + b); // 11

        Console.WriteLine(11 / 3); // 3
        Console.WriteLine(11 % 3); // 2
        Console.WriteLine(12 / 3); // 4

		Console.WriteLine(11.0 / 3); // 3.66666666666667
		Console.WriteLine(11 / 3.0); // 3.66666666666667
		Console.WriteLine(11 % 3);   // 2
		Console.WriteLine(11 % -3);  // 2
		Console.WriteLine(-11 % 3);  // -2

		Console.WriteLine("1.5 / 0.0 = " + (1.5 / 0.0)); // Infinity
		Console.WriteLine("-1.5 / 0.0 = " + (-1.5 / 0.0)); // -Infinity
		Console.WriteLine("0.0 / 0.0 = " + (0.0 / 0.0)); // NaN

		// This will produce DivideByZeroException
		//int x = 0;
		//Console.WriteLine("5 / 0 = " + (5 / x));

		int bigNum = 2000000000;
		int bigSum = 2 * bigNum; // Integer overflow!
		Console.WriteLine(bigSum); // -294967296

		bigNum = Int32.MaxValue;
		bigNum = bigNum + 1;
		Console.WriteLine(bigNum); // -2147483648

		checked
		{
			// This will cause OverflowException
			//bigSum = bigNum * 2;
		}
	}
}

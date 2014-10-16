using System;

class BitwiseOperators
{
	static void Main()
	{
		ushort a = 3;                  // 00000000 00000011 = 3
		ushort b = 5;                  // 00000000 00000101 = 5

		Console.WriteLine( a | b);     // 00000000 00000111 = 7
		Console.WriteLine( a & b);     // 00000000 00000001 = 1
		Console.WriteLine( a ^ b);     // 00000000 00000110 = 6
		Console.WriteLine(~a & b);     // 00000000 00000100 = 4
		Console.WriteLine( a << 1 );   // 00000000 00000110 = 6
		Console.WriteLine( a >> 1 );   // 00000000 00000001 = 1
		Console.WriteLine( a >> 2 );   // 00000000 00000000 = 0
		Console.WriteLine( a << 2 );   // 00000000 00001100 = 12
		Console.WriteLine(~a);         // 11111111 11111100 = -4 = 65532
		Console.WriteLine((ushort)~a); // 11111111 11111100 = -4 = 65532

		// Find the bit at position p in n
		int p = 5;
		int n = 35;               // 00000000 00100011
		int mask = 1 << p;        // 00000000 00100000
		int nAndMask = n & mask;  // 00000000 00100000
		int bit = nAndMask >> p;  // 00000000 00000001
		Console.WriteLine(bit);   // 1
		Console.WriteLine(Convert.ToString(bit, 2).PadLeft(32, '0'));

		// Set the bit at position p to 0 in a number n
		p = 5;
		n = 35;                     // 00000000 00100011
		mask = ~(1 << p);           // 11111111 11011111
		int result = n & mask;      // 00000000 00000011
		Console.WriteLine(result);  // 3
		Console.WriteLine(Convert.ToString(result, 2).PadLeft(32, '0'));

		p = 4;
		n = 35;                     // 00000000 00100011
		mask = 1 << p;              // 00000000 00010000
		result = n | mask;          // 00000000 00110011
		Console.WriteLine(result);  // 51
		Console.WriteLine(Convert.ToString(result, 2).PadLeft(32, '0'));
	}
}

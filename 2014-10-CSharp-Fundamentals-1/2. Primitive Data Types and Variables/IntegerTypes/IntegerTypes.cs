using System;

class IntegerTypes
{
    static void Main()
    {
        byte centuries = 20;    // Usually a small number
        ushort years = 2000;
        uint days = 730480;
        ulong hours = 17531520; // May be a very big number

        Console.WriteLine(
			"{0} centuries is {1} years, or {2} days, or {3} hours.",
			centuries, years, days, hours);
    }
}

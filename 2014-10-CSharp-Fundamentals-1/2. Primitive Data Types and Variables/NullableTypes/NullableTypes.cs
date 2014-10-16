using System;

class NullableTypes
{
    static void Main()
    {
        Console.WriteLine(
			new string('-', 40) +
			"\nExample with integer\n" +
			new string('-', 40));

		int? someInteger = null;
        //int someInteger = null;
        Console.WriteLine(
			"This is the integer with Null value -> " + someInteger);
        someInteger = 5;
        Console.WriteLine(
			"This is the integer with value 5 -> " + someInteger);

        
		Console.WriteLine(
			new string('-', 40) + 
			"\nExample with double\n" + 
			new string('-', 40));
        
        double? someDouble;
        //double someDouble;
        someDouble = null;
        Console.WriteLine(
			"This is the integer with Null value -> " + someDouble);
        someDouble = 2.5;
        Console.WriteLine(
			"This is the integer with value 5 -> " + someDouble);

		int? value = null;
		Console.WriteLine(value.GetValueOrDefault());
		// Console.WriteLine(value.Value); // This will cause an exception
	}
}

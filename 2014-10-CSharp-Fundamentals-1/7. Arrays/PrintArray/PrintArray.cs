using System;

class PrintArrys
{
	static void Main()
	{
		string[] array = {"one", "two", "three", "four"};

		// Process all elements of the array
		for (int index = 0; index < array.Length; index++)
		{
			// Print each element on a separate line
			Console.WriteLine("element[{0}] = {1}", index, array[index]);
		}
	}
}

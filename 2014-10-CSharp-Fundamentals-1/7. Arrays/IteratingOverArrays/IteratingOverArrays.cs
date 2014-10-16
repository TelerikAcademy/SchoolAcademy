using System;

class IteratingOverArrays
{
	static void Main()
	{
        // Create and initialize a 10-element int array
        int[] array = new int[10];
        
        // Set each element to hold its index
        for (int index = 0; index < array.Length; index++)
        {
            array[index] = index;
        }

        // Print the array
        Console.WriteLine("Original array: ");
        foreach (int number in array)
        {
            Console.Write(number + " ");
        }
        Console.WriteLine();

        // Assign value -1 to the odd elements
        for (int index = 1; index < array.Length; index+=2)
        {
            array[index] = -1;
        }

        // Print the array
        Console.WriteLine("Modified array: ");
        foreach (int number in array)
        {
            Console.Write(number + " ");
        }
        Console.WriteLine();
	}
}

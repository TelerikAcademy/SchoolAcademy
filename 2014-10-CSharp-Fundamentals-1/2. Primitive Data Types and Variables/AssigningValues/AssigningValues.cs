using System;

class AssigningValues
{
	static void Main()
	{
		int firstValue = 5;
		int secondValue;
		int thirdValue;
		
		// Using an already declared variable:
		secondValue = firstValue;

		// The following cascade calling assigns
		// 3 to firstValue and then firstValue
		// to thirdValue, so both variables have
		// the value 3 as a result:
		thirdValue = firstValue = 3;
		
		// The following would assign the default
		// value of the int type to num:
		int num = new int(); // num = 0
		
		// This is how we use a literal expression:
		float heightInMeters = 1.74f;
		
		// Here we use an already initialized variable:
		string greeting = "Hello World!";
		string message = greeting;

		Console.WriteLine("{0}\n{1}\n{2}\n{3}\n{4}\n{5}\n{6}\n",
			firstValue, secondValue, thirdValue, num,
			heightInMeters, greeting, message);
	}
}

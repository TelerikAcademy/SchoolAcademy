using System;

class ReadingCharacters
{
    static void Main()
    {
		int i = Console.Read();
		char ch = (char)i;  // Cast the int value to char
		Console.WriteLine("The code of '{0}' is {1}.", ch, i);

		i = Console.Read();
		ch = (char)i;
		Console.WriteLine("The code of '{0}' is {1}.", ch, i);
	}
}

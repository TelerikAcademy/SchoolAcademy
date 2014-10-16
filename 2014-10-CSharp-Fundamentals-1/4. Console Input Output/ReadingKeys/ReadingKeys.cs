using System;

class ReadingKeys
{
    static void Main()
    {
        ConsoleKeyInfo key = Console.ReadKey();
        Console.WriteLine();
		Console.WriteLine("Key name: " + key.Key);
		Console.WriteLine("Key number: " + (int)key.Key);
		Console.WriteLine("Special keys: [{0}] ", key.Modifiers);
		Console.WriteLine("Character entered: " + key.KeyChar);
    }
}

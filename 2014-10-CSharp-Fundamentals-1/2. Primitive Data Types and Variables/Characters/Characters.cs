using System;

class Characters
{
    static void Main()
    {
        char symbol = 'a';
        Console.WriteLine("The code of '{0}' is: {1}",
			symbol, (int) symbol);

        symbol = 'b';
        Console.WriteLine("The code of '{0}' is: {1}",
			symbol, (int) symbol);

        symbol = 'A';
        Console.WriteLine("The code of '{0}' is: {1}",
			symbol, (int)symbol);

        symbol = 'ù'; // Cyrillic letter 'sht'
        Console.WriteLine("The code of '{0}' is: {1}",
            symbol, (int)symbol);

        symbol = '\n'; // New line charater
        Console.WriteLine("The code of '{0}' is: {1}",
            symbol, (int)symbol);

        symbol = '\t'; // Tab charater
        Console.WriteLine("The code of '{0}' is: {1}",
            symbol, (int)symbol);

        symbol = '\r'; // Carriage return charater
        Console.WriteLine("The code of '{0}' is: {1}",
            symbol, (int)symbol);

        symbol = '\u0007'; // Bell charater (sound)
        Console.WriteLine("The code of '{0}' is: {1}",
            symbol, (int)symbol);
    }
}

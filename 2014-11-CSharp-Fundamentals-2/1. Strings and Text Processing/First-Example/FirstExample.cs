using System;

class FirstExample
{
    static void Main()
    {
        string s = "Stand up, stand up, Balkan superman.";
        Console.WriteLine("s = \"{0}\"", s);
        Console.WriteLine("s.Length = {0}", s.Length);
        for (int i = 0; i < s.Length; i++)
        {
            Console.WriteLine("s[{0}] = {1}", i, s[i]);
        }

        foreach (var ch in s)
        {
            Console.Write(ch);
        }
        Console.WriteLine();
    }
}

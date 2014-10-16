using System;

class Program
{
    static void Main(string[] args)
    {
        DateTime now = DateTime.Now;
        DateTime yesterday = new DateTime(2013, 5, 10);
        Console.WriteLine(now);
        Console.WriteLine(yesterday);
        
        //CompareTo -> -1 if now is smaller than yesterday, 0 if both are equal and 1 if now is bigger than yesterday
        Console.WriteLine(now.CompareTo(yesterday));
        Console.WriteLine(now - yesterday);
    }
}

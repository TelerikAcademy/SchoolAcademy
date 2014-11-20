using System;

class ExceptionsProperties
{
    static void Main()
    {
        try
        {
            CauseFormatException();
        }
        catch (FormatException fe)
        {
            Console.Error.WriteLine("Exception caught: " + fe);
            Console.Error.WriteLine("\nMessage: " + fe.Message);
            Console.Error.WriteLine("\nStack Trace: " + fe.StackTrace);
        }
    }

    public static void CauseFormatException()
    {
        string s = "an invalid number";
        Int32.Parse(s);
    }
}

using System;

class FloatingPointTypes
{
    static void Main()
    {
        float floatPI = 3.141592653589793238f;
        double doublePI = 3.141592653589793238;
        Console.WriteLine("Float PI is: {0}", floatPI);
        Console.WriteLine("Double PI is: {0}", doublePI);
        Console.WriteLine();

        // Example of loss of precision (float to double)
        double a = 1.0f;
        double b = 0.33f;
        double expectedSum = 1.33f;
        bool equal = (a + b == expectedSum); // False!!!
        Console.WriteLine(
            "Float calculation: a+b={0}  expected={1}  equal={2}",
            a + b, expectedSum, equal);
        Console.WriteLine();

        // Example of comparison abnormality (double)
        a = 0.1;
        b = 0.2;
        double sum = a + b;
        expectedSum = 0.3;
        equal = (sum == expectedSum);
        Console.WriteLine(
            "Double calculation: a+b={0}  expected={1}  equal={2}",
            sum, expectedSum, equal);
        Console.WriteLine("sum (without rounding) = " +
            System.ComponentModel.TypeDescriptor.GetConverter(sum).ConvertTo(sum, typeof(string)));
        Console.WriteLine();

        // Decimal numbers do not have comparison abnormalities
        decimal aDecimal = 1.0M;
        decimal bDecimal = 0.33M;
        decimal sumDecimal = 1.33M;
        bool equalDecimal = (aDecimal + bDecimal == sumDecimal);
        Console.WriteLine(
			"Decimal calculation: a+b={0}  sum={1}  equal={2}", 
			aDecimal + bDecimal, sumDecimal, equalDecimal);
    }
}

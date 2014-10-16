using System;
using System.Text;
using System.Threading;
using System.Globalization;

class RegionalSettingsDemo
{
	static void Main()
	{
		Console.OutputEncoding = Encoding.UTF8;
		Console.WriteLine("Това е кирилица: ☺");
		Console.WriteLine("© Академия на Телерик, 2013");

		// This will not be displayed in case the
		// Console font does not support Arabic
		Console.WriteLine("السلام عليكم");

		double value = 3.54;
		Console.WriteLine("The value is: {0}", value);
		// Two possible outputs:
		//  - The value is 3.54
		//  - The value is 3,54

		// Change the decimal separator to "."
		Thread.CurrentThread.CurrentCulture =
			CultureInfo.InvariantCulture;

		Console.WriteLine("The value is: {0}", value);
		// The value is 3.54

		// Try entering "1.56" and also "1,2,3,4,5"
		decimal d = Decimal.Parse(Console.ReadLine());
		Console.WriteLine(d);
	}
}

import java.text.MessageFormat;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int squarePerimeter = 17;
        double squareSide = squarePerimeter / 4.0;
        double squareArea = squareSide * squareSide;
        WriteLine(squareSide); // 4.25
        WriteLine(squareArea); // 18.0625

        int a = 5;
        int b = 4;
        WriteLine(a + b); // 9
        WriteLine(a + b++); // 9
        WriteLine(a + b); // 10
        WriteLine(a + (++b)); // 11
        WriteLine(a + b); // 11

        WriteLine(11 / 3); // 3
        WriteLine(11 % 3); // 2
        WriteLine(12 / 3); // 4

        WriteLine(11.0 / 3); // 3.66666666666665
        WriteLine(11 / 3.0); // 3.66666666666665
        WriteLine(11 % 3);   // 2
        WriteLine(11 % -3);  // 2
        WriteLine(-11 % 3);  // -2

        WriteLine("1.5 / 0.0 = " + (1.5 / 0.0)); // Infinity
        WriteLine("-1.5 / 0.0 = " + (-1.5 / 0.0)); // -Infinity
        WriteLine("0.0 / 0.0 = " + (0.0 / 0.0)); // NaN

        // This will produce DivideByZeroException
        //int x = 0;
        //Console.WriteLine("5 / 0 = " + (5 / x));

        int bigNum = 2000000000;
        int bigSum = 2 * bigNum; // Integer overflow!
        WriteLine(bigSum); // -294967296

        bigNum = Integer.MAX_VALUE;
        bigNum = bigNum + 1;
        WriteLine(bigNum); // -2147483648
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }
}
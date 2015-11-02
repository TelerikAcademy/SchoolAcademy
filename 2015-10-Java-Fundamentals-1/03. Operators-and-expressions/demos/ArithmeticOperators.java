import java.text.MessageFormat;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int squarePerimeter = 17;
        double squareSide = squarePerimeter / 4.0;
        double squareArea = squareSide * squareSide;
        writeLine(squareSide); // 4.25
        writeLine(squareArea); // 18.0625

        int a = 5;
        int b = 4;
        writeLine(a + b); // 9
        writeLine(a + b++); // 9
        writeLine(a + b); // 10
        writeLine(a + (++b)); // 11
        writeLine(a + b); // 11

        writeLine(11 / 3); // 3
        writeLine(11 % 3); // 2
        writeLine(12 / 3); // 4

        writeLine(11.0 / 3); // 3.66666666666665
        writeLine(11 / 3.0); // 3.66666666666665
        writeLine(11 % 3);   // 2
        writeLine(11 % -3);  // 2
        writeLine(-11 % 3);  // -2

        writeLine("1.5 / 0.0 = " + (1.5 / 0.0)); // Infinity
        writeLine("-1.5 / 0.0 = " + (-1.5 / 0.0)); // -Infinity
        writeLine("0.0 / 0.0 = " + (0.0 / 0.0)); // NaN

        // This will produce DivideByZeroException
        //int x = 0;
        //Console.writeLine("5 / 0 = " + (5 / x));

        int bigNum = 2000000000;
        int bigSum = 2 * bigNum; // Integer overflow!
        writeLine(bigSum); // -294967296

        bigNum = Integer.MAX_VALUE;
        bigNum = bigNum + 1;
        writeLine(bigNum); // -2147483648
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }
}
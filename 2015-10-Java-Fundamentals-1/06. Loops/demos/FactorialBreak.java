import java.math.BigInteger;
import java.text.MessageFormat;
import java.util.Scanner;

public class FactorialBreak {
    public static void main(String[] args) {
        Write("n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Write("n! = ");

        // "BigInteger" is the biggest integer type
        BigInteger factorial = BigInteger.ONE;

        // Perform an infinite loop
        while (true) {
            Write(n);
            if (n == 1) {
                break;
            }

            Write(" * ");
            factorial = factorial.multiply(BigInteger.valueOf(n));
            n--;
        }
        writeLine(" = {0}", factorial);
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void writeLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
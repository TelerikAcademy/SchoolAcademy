import java.math.BigInteger;
import java.text.MessageFormat;

public class ForLoops {
    public static void main(String[] args) {
        for (int num = 0; num < 10; num++) {
            Write(num + " ");
        }
        System.out.println();

        int n = 5;
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        WriteLine("{0}! = {1}", n, factorial);
        System.out.println();

        for (int i = 1, sum = 1; i <= 128; i = i * 2, sum += i) {
            WriteLine("i = {0}, sum = {1}", i, sum);
        }
        System.out.println();
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void WriteLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
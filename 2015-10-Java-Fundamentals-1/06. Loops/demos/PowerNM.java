import java.math.BigInteger;
import java.text.MessageFormat;
import java.util.Scanner;

public class PowerNM {
    public static void main(String[] args) {
        Write("n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Write("m = ");
        int m = scanner.nextInt();

        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < m; i++) {
            result = result.multiply(BigInteger.valueOf(n));
        }

        writeLine("n^m = {0}", result);
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void writeLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
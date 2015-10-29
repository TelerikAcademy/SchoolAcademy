import java.text.MessageFormat;
import java.util.Scanner;

public class PrimesInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Write("n = ");
        int n = scanner.nextInt();
        Write("m = ");
        int m = scanner.nextInt();

        boolean isPrime;
        int divider;
        int maxDivider;
        if ((n > 1) && (m > n)) {
            for (int num = n; num <= m; num++) {
                isPrime = true;
                divider = 2;
                maxDivider = (int) Math.sqrt(num);

                while (divider <= maxDivider) {
                    if (num % divider == 0) {
                        isPrime = false;
                        break;
                    }
                    divider++;
                }

                if (isPrime) {
                    Write("{0} ", num);
                }
            }

            System.out.println();
        }
        else {
            WriteLine("Invalid range!");
        }
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void Write(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.print(form.format(obj));
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }
}
import java.text.MessageFormat;
import java.util.Scanner;

public class ContinueSumOdd {
    public static void main(String[] args) {
        Write("n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            if ((i % 7) == 0) {
                continue;
            }

            sum += i;
        }
        WriteLine("sum = {0}", sum);
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void WriteLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
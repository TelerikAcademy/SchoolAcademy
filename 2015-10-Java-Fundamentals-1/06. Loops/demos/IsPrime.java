import java.text.MessageFormat;
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Write("Enter a positive integer number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int divider = 2;
        int maxDivider = (int)Math.sqrt(number);
        boolean prime = true;
        while (prime && (divider <= maxDivider)) {
            if (number % divider == 0) {
                prime = false;
            }
            divider++;
        }

        WriteLine("Prime? {0}", prime);
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }

    public static void WriteLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
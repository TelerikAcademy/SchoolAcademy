import java.text.MessageFormat;
import java.util.Scanner;

public class SetBitValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int value = scanner.nextInt();
        int position = scanner.nextInt();

        if (value == 0) {
            int mask = ~(1 << position);
            int result = number & mask;
            WriteLine(result);
        }
        else if (value == 1) {
            int mask = 1 << position;
            int result = number | mask;
            WriteLine(result);
        }
        else {
            WriteLine("Your program sucks!");
        }
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }

    public static void WriteLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
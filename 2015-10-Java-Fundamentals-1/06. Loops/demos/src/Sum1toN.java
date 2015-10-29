import java.text.MessageFormat;
import java.util.Scanner;

public class Sum1toN {
    public static void main(String[] args) {
        Write("n = ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number = 1;
        int sum = 1;

        Write("The sum 1");
        while (number < n)
        {
            number++;
            sum += number;
            Write("+{0}", number);
        }
        WriteLine(" = {0}", sum);
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

    public static void WriteLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
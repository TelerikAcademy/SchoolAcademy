import java.text.MessageFormat;
import java.util.Scanner;

public class IfStatementExample {
    public static void main(String[] args) {
        WriteLine("Please enter two numbers (on separate lines).");

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int biggerNumber = firstNumber;
        if (secondNumber > firstNumber) {
            biggerNumber = secondNumber;
        }

        WriteLine("The bigger number is: {0}", biggerNumber);
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }

    public static void WriteLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
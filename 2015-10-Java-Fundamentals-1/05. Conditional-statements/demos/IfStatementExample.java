import java.text.MessageFormat;
import java.util.Scanner;

public class IfStatementExample {
    public static void main(String[] args) {
        writeLine("Please enter two numbers (on separate lines).");

        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int biggerNumber = firstNumber;
        if (secondNumber > firstNumber) {
            biggerNumber = secondNumber;
        }

        writeLine("The bigger number is: {0}", biggerNumber);
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }

    public static void writeLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
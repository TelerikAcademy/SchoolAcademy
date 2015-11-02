import java.text.MessageFormat;
import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        writeLine("Enter two numbers (on separate lines).");

        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        if (first == second) {
            writeLine("These two numbers are equal.");
        }
        else {
            if (first > second) {
                writeLine("The first number is greater.");
            }
            else {
                writeLine("The second number is greater.");
            }
        }
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }
}
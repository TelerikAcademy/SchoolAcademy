import java.text.MessageFormat;
import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        WriteLine("Enter two numbers (on separate lines).");

        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        if (first == second) {
            WriteLine("These two numbers are equal.");
        }
        else {
            if (first > second) {
                WriteLine("The first number is greater.");
            }
            else {
                WriteLine("The second number is greater.");
            }
        }
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }
}
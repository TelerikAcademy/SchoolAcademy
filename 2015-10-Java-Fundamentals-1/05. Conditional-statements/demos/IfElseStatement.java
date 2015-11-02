import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Write("Please enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            writeLine("This number is even.");
        }
        else {
            writeLine("This number is odd.");
        }
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }
}
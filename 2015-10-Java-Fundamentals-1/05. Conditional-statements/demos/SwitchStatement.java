import java.text.MessageFormat;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Write("Enter a number in the range [1..7]: ");

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day)
        {
            case 1: writeLine("Monday"); break;
            case 2: writeLine("Tuesday"); break;
            case 3: writeLine("Wednesday"); break;
            case 4: writeLine("Thursday"); break;
            case 5: writeLine("Friday"); break;
            case 6: writeLine("Saturday");break;
            case 7: writeLine("Sunday"); break;
            default: writeLine("Invalid day!"); break;
        }
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }
}
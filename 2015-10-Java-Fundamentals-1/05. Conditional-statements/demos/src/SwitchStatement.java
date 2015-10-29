import java.text.MessageFormat;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Write("Enter a number in the range [1..7]: ");

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day)
        {
            case 1: WriteLine("Monday"); break;
            case 2: WriteLine("Tuesday"); break;
            case 3: WriteLine("Wednesday"); break;
            case 4: WriteLine("Thursday"); break;
            case 5: WriteLine("Friday"); break;
            case 6: WriteLine("Saturday");break;
            case 7: WriteLine("Sunday"); break;
            default: WriteLine("Invalid day!"); break;
        }
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }
}
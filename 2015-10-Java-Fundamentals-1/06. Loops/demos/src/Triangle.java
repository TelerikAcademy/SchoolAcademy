import java.text.MessageFormat;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Write("n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                Write("{0} ", col);
            }

            System.out.println();
        }
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void Write(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
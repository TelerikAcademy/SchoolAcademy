import java.text.MessageFormat;
import java.util.Scanner;

public class CheckSymmetry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Write("Number of elements = ");
        int size = scanner.nextInt();

        // Declaring the array
        int[] array = new int[size];

        // Filing the array
        for (int i = 0; i < size; i++) {
            Write("arr[{0}] = ", i);
            array[i] = scanner.nextInt();
        }

        boolean isSymmetric = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[size - i - 1]) {
                isSymmetric = false;
                break;
            }
        }

        WriteLine("Symmetric? --> {0}", isSymmetric);
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void Write(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.print(form.format(obj));
    }

    public static void WriteLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
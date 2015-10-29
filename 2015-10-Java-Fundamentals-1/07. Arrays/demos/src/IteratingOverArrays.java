import java.text.MessageFormat;

public class IteratingOverArrays {
    public static void main(String[] args) {
// Create and initialize a 10-element int array
        int[] array = new int[10];

        // Set each element to hold its index
        for (int index = 0; index < array.length; index++) {
            array[index] = index;
        }

        // Print the array
        WriteLine("Original array: ");
        for (int number : array) {
            Write(number + " ");
        }

        System.out.println();

        // Assign value -1 to the odd elements
        for (int index = 1; index < array.length; index += 2) {
            array[index] = -1;
        }

        // Print the array
        WriteLine("Modified array: ");
        for (int number : array) {
            Write(number + " ");
        }

        System.out.println();
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }

    public static void WriteLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
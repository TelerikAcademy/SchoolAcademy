import java.text.MessageFormat;

public class Reverse {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4, 5 };

        // Get array size
        int length = array.length;

        // Declare and create the reversed array
        int[] reversed = new int[length];

        // Initialize the reversed array
        for (int index = 0; index < length; index++) {
            reversed[length - index - 1] = array[index];
        }

        // Print the reversed array elements
        for (int index = 0; index < length; index++) {
            writeLine(reversed[index]);
        }
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }
}
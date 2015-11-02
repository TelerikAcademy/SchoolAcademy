import java.text.MessageFormat;

public class PrintArray {
    public static void main(String[] args) {
        String[] array = { "one", "two", "three", "four" };

        // Process all elements of the array
        for (int index = 0; index < array.length; index++) {
            // Print each element on a separate line
            writeLine("element[{0}] = {1}", index, array[index]);
        }
    }

    public static void writeLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
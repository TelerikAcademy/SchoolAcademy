import java.text.MessageFormat;

public class JaggedArrays {
    public static void main(String[] args) {
        int[] numbers = { 0, 1, 4, 113, 55, 3, 1, 2, 66, 557, 124, 2 };
        int[] sizes = new int[3];
        int[] offsets = new int[3];

        // Calculate the sizes for each reminder (0, 1 and 2)
        for (int number : numbers) {
            int remainder = number % 3;
            sizes[remainder]++;
        }

        // Calculate the list of numbers for each reminder (0, 1 and 2)
        int[][] numbersByRemainder = { new int[sizes[0]], new int[sizes[1]], new int[sizes[2]] };
        for (int number : numbers) {
            int remainder = number % 3;
            int index = offsets[remainder];
            numbersByRemainder[remainder][index] = number;
            offsets[remainder]++;
        }

        // Print the result jagged array
        for (int row = 0; row < numbersByRemainder.length; row++){
            for (int num : numbersByRemainder[row]){
                Write(num + " ");
            }
            System.out.println();
        }
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }

    public static void writeLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
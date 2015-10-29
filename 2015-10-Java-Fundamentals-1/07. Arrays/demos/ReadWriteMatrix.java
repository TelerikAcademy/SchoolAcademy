import java.text.MessageFormat;
import java.util.Scanner;

public class ReadWriteMatrix {
    public static void main(String[] args) {
        // Read the matrix dimensions
        Scanner scanner = new Scanner(System.in);
        Write("Number of rows = ");
        int rows = scanner.nextInt();
        Write("Number of columns = ");
        int cols = scanner.nextInt();

        // Allocate the matrix
        int[][] matrix = new int[rows][cols];

        // Enter the matrix elements
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Write("matrix[{0},{1}] = ", row, col);
                int element = scanner.nextInt();
                matrix[row][col] = element;
            }
        }
        System.out.println();

        // Print the matrix on the console
        WriteLine("The matrix is as follows:");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Write("{0} ", matrix[row][col]);
            }

            System.out.println();
        }
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }

    public static void Write(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.print(form.format(obj));
    }
}
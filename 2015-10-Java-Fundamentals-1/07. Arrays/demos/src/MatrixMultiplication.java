import java.text.MessageFormat;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] firstMatrix = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };

        // Print the first matrix
        for (int row = 0; row < firstMatrix.length; row++){
            for (int col = 0; col < firstMatrix[row].length; col++){
                Write("{0} ", firstMatrix[row][col]);
            }

            System.out.println();
        }

        System.out.println();

        int[][] secondMatrix = { { 1, 2, 3 }, { 4, 5, 6 } };

        // Print the second matrix
        for (int row = 0; row < secondMatrix.length; row++) {
            for (int col = 0; col < secondMatrix[row].length; col++) {
                Write("{0} ", secondMatrix[row][col]);
            }

            WriteLine();
        }

        WriteLine();

        // Multiply the first matrix with the second matrix
        int width1 = firstMatrix.GetLength(1);
        int height1 = firstMatrix.GetLength(0);
        int width2 = secondMatrix.GetLength(1);
        int height2 = secondMatrix.GetLength(0);

        if (width1 != height2)
        {
            throw new ArgumentException("Invalid dimensions!");
        }

        int[,] resultMatrix = new int[height1, width2];
        for (int row = 0; row < height1; row++)
        {
            for (int col = 0; col < width2; col++)
            {
                resultMatrix[row, col] = 0;
                for (int i = 0; i < width1; i++)
                {
                    resultMatrix[row, col] += firstMatrix[row, i] * secondMatrix[i, col];
                }
            }
        }

        // Print the result matrix
        for (int row = 0; row < resultMatrix.GetLength(0); row++)
        {
            for (int col = 0; col < resultMatrix.GetLength(1); col++)
            {
                Write("{0} ", resultMatrix[row, col]);
            }

            WriteLine();
        }

        WriteLine();
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void Write(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.print(form.format(obj));
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }

    public static void WriteLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
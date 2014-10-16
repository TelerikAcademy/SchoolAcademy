using System;

public class PascalTriangle
{
    private int height;
    private long[][] triangle;

    public PascalTriangle(int height)
    {
        this.height = height;

        // Allocate the array in a triangle form
        triangle = new long[height + 1][];

        for (int row = 0; row <= height; row++)
        {
            triangle[row] = new long[row + 1];
        }
    }

    public void PrintTriangle()
    {
        for (int row = 0; row <= height; row++)
        {
            Console.Write("".PadLeft((height - row) * 2));
            for (int col = 0; col <= row; col++)
            {
                Console.Write("{0,3} ", triangle[row][col]);
            }
            Console.WriteLine();
        }
    }

    public void CalculateTriangle()
    {
        triangle[0][0] = 1;

        for (int row = 0; row < height; row++)
        {
            for (int col = 0; col <= row; col++)
            {
                triangle[row + 1][col] += triangle[row][col];
                triangle[row + 1][col + 1] += triangle[row][col];
            }
        }
    }

    static void Main()
    {
        PascalTriangle pascalTriangle = new PascalTriangle(10);
        pascalTriangle.CalculateTriangle();
        pascalTriangle.PrintTriangle();
    }
}

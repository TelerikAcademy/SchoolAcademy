import java.text.MessageFormat;

public class ComparisonAndAssignmentOperators {
    public static void main(String[] args) {
        // Comparison operators
        int a = 5;
        int b = 4;
        writeLine(a >= b); // True
        writeLine(a != b); // True
        writeLine(a != ++b); // False
        writeLine(a > b); // False

        // Assignment operators
        int x = 6;
        int y = 4;
        writeLine(y *= 2); // 8
        int z = y = 3; // y=3 and z=3
        writeLine(z); // 3
        writeLine(x |= 1); // 7
        writeLine(x += 3); // 10
        writeLine(x /= 2); // 5
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }
}
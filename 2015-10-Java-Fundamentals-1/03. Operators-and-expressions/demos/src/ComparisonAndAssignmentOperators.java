import java.text.MessageFormat;

public class ComparisonAndAssignmentOperators {
    public static void main(String[] args) {
        // Comparison operators
        int a = 5;
        int b = 4;
        WriteLine(a >= b); // True
        WriteLine(a != b); // True
        WriteLine(a != ++b); // False
        WriteLine(a > b); // False

        // Assignment operators
        int x = 6;
        int y = 4;
        WriteLine(y *= 2); // 8
        int z = y = 3; // y=3 and z=3
        WriteLine(z); // 3
        WriteLine(x |= 1); // 7
        WriteLine(x += 3); // 10
        WriteLine(x /= 2); // 5
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }
}
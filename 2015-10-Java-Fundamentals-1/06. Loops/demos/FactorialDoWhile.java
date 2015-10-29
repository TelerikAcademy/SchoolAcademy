import java.math.BigInteger;
import java.util.Scanner;

public class FactorialDoWhile {
    public static void main(String[] args) {
        Write("n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger factorial = BigInteger.ONE;

        do {
            factorial = factorial.multiply(BigInteger.valueOf(n));
            n--;
        } while (n > 0);

        WriteLine("n! = " + factorial);
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }
}
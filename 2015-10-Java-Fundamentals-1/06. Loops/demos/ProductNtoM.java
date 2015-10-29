import java.math.BigInteger;
import java.util.Scanner;

public class ProductNtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Write("n = ");
        int n = scanner.nextInt();
        Write("m = ");
        int m = scanner.nextInt();

        if (n < m) {
            int num = n;
            BigInteger product = BigInteger.ONE;
            do {
                product = product.multiply(BigInteger.valueOf(num));
                num++;
            }
            while(num <= m);

            WriteLine("product[n..m] = " + product);
        }
        else {
            WriteLine("Error: n should be smaller than m.");
        }
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }
}
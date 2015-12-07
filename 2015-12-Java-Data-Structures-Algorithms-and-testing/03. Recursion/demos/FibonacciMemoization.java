import java.math.BigInteger;

public class FibonacciMemoization {
  static final int MAX_FIB = 301;
  static BigInteger[] fib = new BigInteger[MAX_FIB];
  static BigInteger fibonacci(int n) {
    if (fib[n] == null) {
      // The value of fib[n] is still not calculated
      if ((n == 1) || (n == 2)) {
        fib[n] = BigInteger.valueOf(1);
      } else {
        fib[n] = fibonacci(n - 1).add(fibonacci(n - 2));
      }
    }

    return fib[n];
  }

  public static void main(String[] args) {
    System.out.println(fibonacci(10));
    System.out.println(fibonacci(300));
  }
}
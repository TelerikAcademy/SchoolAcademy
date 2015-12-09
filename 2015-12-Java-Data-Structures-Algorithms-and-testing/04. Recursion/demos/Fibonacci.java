public class Fibonacci {
  static long fibonacci(int n) {
    if ((n == 1) || (n == 2)) {
      return 1;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  public static void main(String[] args) {
    System.out.println(fibonacci(10)); // 89
    System.out.println(fibonacci(20)); // 6765
    System.out.println(fibonacci(30)); // 832040
    System.out.println(fibonacci(40)); // 102334155
    System.out.println(fibonacci(50)); // This will hang for a few minutes!
    System.out.println(fibonacci(60)); // This will hang for much more..!
  }
}
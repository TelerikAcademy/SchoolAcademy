import java.math.BigInteger;

public class ForLoops {
  public static void main(String[] args) {
    for (int i = 0; i < 10; ++i) {
      System.out.printf("%d ", i);
    }
    System.out.println();

    int number = 5;
    BigInteger factorial = BigInteger.ONE;
    for (int i = 1; i <= number; i++) {
      factorial = factorial.multiply(BigInteger.valueOf(i));
    }
    System.out.printf("%d! = %s%n", number, factorial);

    for (int i = 1, sum = 1; i <= 128; i = i * 2, sum += i) {
      System.out.printf("i = %d, sum = %d%n", i, sum);
    }
  }
}

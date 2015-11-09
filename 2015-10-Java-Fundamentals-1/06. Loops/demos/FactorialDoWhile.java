import java.math.BigInteger;
import java.util.Scanner;

public class FactorialDoWhile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("n = ");
    int number = scanner.nextInt();
    BigInteger factorial = BigInteger.ONE;

    do {
      factorial = factorial.multiply(BigInteger.valueOf(number));
      --number;
    } while (number > 0);

    System.out.printf("n! = %s%n", factorial);
  }
}

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialBreak {
  public static void main(String[] args) {
    System.out.println("n = ");
    
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    System.out.print("n! = ");

    // "BigInteger" is the biggest integer type
    BigInteger factorial = BigInteger.ONE;

    // Perform an infinite loop
    while (true) {
      System.out.print(number);
      if (number == 1) {
        break;
      }

      System.out.print(" * ");
      factorial = factorial.multiply(BigInteger.valueOf(number));
      --number;
    }
    System.out.printf(" = %s", factorial);
  }
}

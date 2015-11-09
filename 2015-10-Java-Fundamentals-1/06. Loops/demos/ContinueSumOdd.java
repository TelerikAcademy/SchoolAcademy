import java.util.Scanner;

public class ContinueSumOdd {
  public static void main(String[] args) {
    System.out.print("n = ");
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();

    int sum = 0;

    for (int i = 1; i <= count; i += 2) {
      if ((i % 7) == 0) {
        continue;
      }

      sum += i;
    }

    System.out.printf("sum = %d%n", sum);
  }
}

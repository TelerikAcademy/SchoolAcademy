import java.util.Scanner;

public class IsPrime {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("Enter a positive integer number: ");
    int number = scanner.nextInt();
    int divider = 2;
    int maxDivider = (int)Math.sqrt(number);
    boolean prime = true;
        
    while (prime && (divider <= maxDivider)) {
      if (number % divider == 0) {
        prime = false;
      }
      
      divider++;
    }

    System.out.printf("Prime? %s%n", prime);
  }
}

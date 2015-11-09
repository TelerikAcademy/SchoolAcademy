import java.util.Scanner;

class ScannerDemo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    
    System.out.print("Enter a floating-point number: ");
    double doubleNumber = scanner.nextDouble();

    System.out.print("Enter a string: ");
    String str = scanner.next();

    System.out.printf("Number: %d%nFloating-point number: %f%nString: %s", 
                      number, doubleNumber, str);
  }
}

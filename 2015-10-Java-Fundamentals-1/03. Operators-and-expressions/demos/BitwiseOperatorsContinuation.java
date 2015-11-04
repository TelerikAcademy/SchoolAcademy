public class BitwiseOperatorsContinuation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int number = scanner.nextInt();
    int position = scanner.nextInt();

    int mask = 1 << position;
    int result = mask & number;
    result = result >> position;

    if (result == 1) {
      System.out.println(true);
    } else if (result == 0) {
      System.out.println(false);
    } else {
      System.out.println("Your program does not work!");
    }
  }
}

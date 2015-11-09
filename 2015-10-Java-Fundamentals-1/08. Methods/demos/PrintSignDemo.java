class PrintSignDemo {
  public static void main(String[] args) {
    printSign(-5); //outputs "The number -5 is negative."
    printSign(100); //outputs "The number 100 is positive."
    printSign(0); //outputs "The number 0 is zero."
  }

  static void printSign(int number) {
    if (number > 0) {
      System.out.println("The number %d is positive.", number);
    } else if (number < 0) {
      System.out.println("The number %d is negative.", number);
    } else {
      System.out.println("The number %d is zero.", number);
    }
  }
}

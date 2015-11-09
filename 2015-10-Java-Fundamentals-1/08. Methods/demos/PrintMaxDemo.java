class PrintMaxDemo{
  public static void main(String[] args) {
    printMax(1, 2); // outputs "Maximal number: 2.0"
    printMax(1.0f, 2.0f); // outputs "Maximal number: 2.0"
    printMax(2, 1.5f); // outputs "Maximal number: 2.0"
    printMax(0, 0); // outputs "Maximal number: 0.0"
  }

  static void printMax(float first, float second) {
    float max = first;
    if (max < second) {
      max = second;
    }

    System.out.printf("Maximal number: %f%n", max);
  }
}

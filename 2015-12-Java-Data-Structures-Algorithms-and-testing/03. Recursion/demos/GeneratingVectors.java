public class GeneratingVectors {
  static void print(int[] vector) {
    String result = "";
    for (int i = vector.length - 1; i >= 0; i--) {
      result += vector[i];
    }

    System.out.println(result);
  }

  static void gen01(int index, int[] vector) {
    if (index == -1) {
      print(vector);
    } else {
      for (int i = 0; i <= 1; i++) {
        vector[index] = i;
        gen01(index - 1, vector);
      }
    }
  }

  public static void main(String[] args) {
    int size = 8;
    int[] vector = new int[size];
    gen01(size - 1, vector);
  }
}
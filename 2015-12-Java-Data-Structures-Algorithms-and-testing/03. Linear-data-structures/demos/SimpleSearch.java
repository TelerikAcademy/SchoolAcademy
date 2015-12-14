public class SimpleSearch {
  public static void main(String[] args) {
    int[] arr = {2, 4, 6, 8, 1, 12, 5, 9, 10};
    int indexOf = find(arr, 12);

    System.out.println(indexOf);
  }

  private static int find(int[] arr, int number) {
    int resultIndex = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == number) {
        resultIndex = i;
        break;
      }
    }

    return resultIndex;
  }
}
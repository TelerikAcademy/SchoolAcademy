package liveDemos;

public class InsertionSort {
  private static void sort(int[] arr) {
//    for i = 1 ... n - 1
//    valueToInsert = a[i]
//    holePos = i
//    while holePos > 0 and valueToInsert < A[holePos - 1]
//    a[holePos] = A[holePos - 1] // shift the larger value up
//    holePos = holePos - 1       // move the hole position down
//    A[holePos] = valueToInsert

    for (int i = 1; i < arr.length; i++) {
      int valueToInsert = arr[i];
      int holePos = i;
      while (holePos > 0 && valueToInsert < arr[holePos - 1]) {
        arr[holePos] = arr[holePos - 1];
        arr[holePos] = valueToInsert;
        holePos = holePos - 1;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = {4, 5, 3, 21, 15, 1, 2, 7, 3, 12};
    sort(arr);
    printArr(arr);
  }

  private static void printArr(int[] arr) {
    for (int num : arr) {
      System.out.print(num + ", ");
    }
  }
}
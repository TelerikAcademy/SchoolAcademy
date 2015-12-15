package liveDemos;

public class BubbleSort {
  public static void bubbleSort(int[] arr) {
    boolean swapIsDone = true;
    while (swapIsDone) {
      swapIsDone = false;

      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          swap(arr, i, i + 1);
          swapIsDone = true;
        }
      }
    }
  }

  private static void swap(int[] arr, int j, int i) {
    int temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
  }

  public static void main(String[] args) {
    int[] arr = {4, 5, 3, 21, 15, 1, 2, 7, 3, 12};
    bubbleSort(arr);
    printArr(arr);
  }

  private static void printArr(int[] arr) {
    for (int num : arr) {
      System.out.print(num + ", ");
    }
  }
}
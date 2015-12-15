package liveDemos;

import java.util.Scanner;

public class SelectionSort {
  public static void sort(int[] arr) {
    for (int j = 0; j < arr.length - 1; j++) {
      int best = j;
      for (int i = j + 1; i < arr.length; i++) {
        if (arr[i] < arr[best]) {
          best = i;
        }
      }

      if (best != j) {
        swap(arr, j, best);
      }
    }
  }

  private static void swap(int[] arr, int j, int i) {
    int temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    // "4 5 3 2 15 1 2 7 3 1";

    String[] numStr = input.split(" ");
    int[] nums = new int[numStr.length];

    for (int i = 0; i < numStr.length; i++) {
      nums[i] = Integer.parseInt(numStr[i]);
    }

    sort(nums);

    for (int num : nums) {
      System.out.print(num + ", ");
    }
  }
}
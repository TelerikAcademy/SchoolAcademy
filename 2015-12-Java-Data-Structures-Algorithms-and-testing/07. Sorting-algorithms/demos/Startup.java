import java.util.ArrayList;
import java.util.Random;

public class Startup {
  public static void main(String[] args) {
    GenericSorter sorter = new HeapSorter();

    // sort an array on integers using selection sort
    Integer[] arr = {2, 6, 1, 4, 12, 7, 4};
    printArray(arr);

    sorter.sort(arr);
    printArray(arr);

    // sort a list on integers using selection sort
//    ArrayList<Integer> list = new ArrayList<>();
//    Random rand = new Random();
//    for (int i = 0; i < 10; i++) {
//      list.add(rand.nextInt(100) + 1);
//    }
//    sorter.sort(list);
//
//    System.out.println(list);
  }

  private static void printArray(Integer[] arr) {
    for (Integer integer : arr) {
      System.out.print(integer + ", ");
    }
    System.out.println();
  }
}
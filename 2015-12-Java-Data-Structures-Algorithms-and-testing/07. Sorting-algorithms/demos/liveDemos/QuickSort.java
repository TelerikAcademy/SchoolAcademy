package liveDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  QuickSort {
  public static List<Integer> sort(List<Integer> list) {
    if (list.size() <= 1) {
      return list;
    }

    int pivot = selectPivot(list);
    List<Integer> less = new ArrayList<>();
    List<Integer> greater = new ArrayList<>();

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) < list.get(pivot)) {
        less.add(list.get(i));
      } else if (list.get(i) > list.get(pivot)) {
        greater.add(list.get(i));
      }
    }

    less = sort(less);
    greater = sort(greater);

    return concatenate(less, list.get(pivot), greater);
  }

  private static List<Integer> concatenate(List<Integer> less, int pivot, List<Integer> greater) {
    List<Integer> result = new ArrayList<>();

    for (Integer num : less) {
      result.add(num);
    }
    result.add(pivot);
    for (Integer num : greater) {
      result.add(num);
    }

    return result;
  }

  private static int selectPivot(List<Integer> list) {
    return list.size() / 2;
  }

  public static void main(String[] args) {
    Integer[] arr = {4, 5, 3, 21, 15, 8, 2, 7, 3, 12};
    List<Integer> list = Arrays.asList(arr);
    list = sort(list);
    System.out.println(list);
  }
}
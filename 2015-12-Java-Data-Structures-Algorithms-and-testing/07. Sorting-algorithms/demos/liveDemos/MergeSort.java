package liveDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
  public static void main(String[] args) {
    Integer[] arr = {4, 5, 3, 21, 15, 8, 2, 7, 3, 12};
    List<Integer> list = Arrays.asList(arr);
    list = sort(list);
    System.out.println(list);
  }

  private static List<Integer> sort(List<Integer> list) {
    if (list.size() <= 1) {
      return list;
    }

    List<Integer> left = new ArrayList<>();
    List<Integer> right = new ArrayList<>();
    for (int i = 0, mid = list.size() / 2; i < list.size(); i++) {
      if (i < mid) {
        left.add(list.get(i));
      } else {
        right.add(list.get(i));
      }
    }

    left = sort(left);
    right = sort(right);

    return merge(left, right);
  }

  private static List<Integer> merge(List<Integer> left, List<Integer> right) {
    List<Integer> result = new ArrayList<>();
    while (left.size() > 0 || right.size() > 0) {
      if (left.size() > 0 && right.size() > 0) {
        if (left.get(0) < right.get(0)) {
          result.add(left.remove(0));
        } else {
          result.add(right.remove(0));
        }
      } else if (left.size() > 0) {
        result.add(left.remove(0));
      } else if (right.size() > 0) {
        result.add(right.remove(0));
      }
    }

    return result;
  }
}
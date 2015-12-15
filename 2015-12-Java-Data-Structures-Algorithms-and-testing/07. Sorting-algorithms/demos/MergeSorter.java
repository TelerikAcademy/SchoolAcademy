import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSorter extends GenericSorter {
  @Override
  public <T extends Comparable<T>> void sort(T[] array) {
    List<T> list = mergeSort(Arrays.asList(array));
    list.toArray(array);
  }

  @Override
  public <T extends Comparable<T>> void sort(List<T> list) {
    list = mergeSort(list);
  }

  private <T extends Comparable<T>> List<T> mergeSort(List<T> list) {
    if (list.size() <= 1) {
      return list;
    }

    int mid = list.size() / 2;

    List<T> left = new ArrayList<>();
    List<T> right = new ArrayList<>();

    for (int i = 0; i < list.size(); i++) {
      if (i < mid) {
        left.add(list.get(i));
      } else {
        right.add(list.get(i));
      }
    }

    left = mergeSort(left);
    right = mergeSort(right);

    return merge(left, right);
  }
  
  private <T extends Comparable<T>> List<T> merge(List<T> left, List<T> right) {
    List<T> merged = new ArrayList<>();

    while (left.size() > 0 || right.size() > 0) {
      if (left.size() > 0 && right.size() > 0) {
        if (left.get(0).compareTo(right.get(0)) < 0) {
          merged.add(left.remove(0));
        } else {
          merged.add(right.remove(0));
        }
      } else if (left.size() > 0) {
        merged.add(left.remove(0));
      } else if (right.size() > 0) {
        merged.add(right.remove(0));
      }
    }

    return merged;
  }
}
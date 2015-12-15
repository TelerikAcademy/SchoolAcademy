import java.util.List;

public class BubbleSorter extends GenericSorter {
  @Override
  public <T extends Comparable<T>> void sort(List<T> list) {
    boolean swapIsDone = true;
    while (swapIsDone) {
      swapIsDone = false;
      for (int i = 0; i < list.size() - 1; i++) {
        if (list.get(i + 1).compareTo(list.get(i)) < 0) {
          swap(list, i, i + 1);
          swapIsDone = true;
        }
      }
    }
  }
}
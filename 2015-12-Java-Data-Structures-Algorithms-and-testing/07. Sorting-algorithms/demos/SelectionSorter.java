import java.util.List;

public class SelectionSorter extends GenericSorter {
  @Override
  public <T extends Comparable<T>> void sort(List<T> list) {
    int best;
    for (int j = 0; j < list.size() - 1; j++) {
      best = j;
      for (int i = j + 1; i < list.size(); i++) {
        if (list.get(i).compareTo(list.get(best)) < 0) {
          best = i;
        }
      }

      if (best != j) {
        swap(list, j, best);
      }
    }
  }
}
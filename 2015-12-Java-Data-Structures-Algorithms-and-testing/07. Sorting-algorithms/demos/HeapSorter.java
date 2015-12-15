import java.util.List;

public class HeapSorter extends GenericSorter {
  @Override
  public <T extends Comparable<T>> void sort(List<T> list) {
    heapify(list);

  }
  
  private <T extends Comparable<T>> void heapify(List<T> list) {
    for (int i = list.size() / 2; i < list.size(); i++) {
      sink(list, i, list.size());
    }
  }
  
  private <T extends Comparable<T>> void sink(List<T> list, int i, int n) {
    int lc = 2 * i + 1; // left child index
    if (lc >= n) {
      return; // no children
    }

    int rc = lc + 1; // right child index
    int mc = lc;     // max child index
    if (rc < n && list.get(lc).compareTo(list.get(rc)) < 0) {
      mc = rc;
    }

    if (list.get(i).compareTo(list.get(mc)) >= 0) {
      return; // heap ordered
    }

    swap(list, i, mc);
    sink(list, mc, n);
  }
}
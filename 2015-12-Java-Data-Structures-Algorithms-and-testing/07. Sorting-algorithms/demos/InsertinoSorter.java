import java.util.List;

public class InsertinoSorter extends GenericSorter {
  @Override
  <T extends Comparable<T>> void sort(List<T> list) {
    T valueToInsert;
    int holePos;

    for (int i = 1; i < list.size() - 1; i++) {
      valueToInsert = list.get(i);
      holePos = i;
      while (holePos > 0 && valueToInsert.compareTo(list.get(holePos - 1)) < 0) {
        list.set(holePos, list.get(holePos - 1)); // shift the larger value up
        holePos = holePos - 1;      // move the hole position down
        list.set(holePos, valueToInsert);
      }
    }
  }
}
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public abstract class GenericSorter {
  protected Object[] array;

  public <T extends Comparable<T>> void sort(T[] array) {
    sort(Arrays.asList(array));
  }

  abstract <T extends Comparable<T>> void sort(List<T> list);

  protected static <T> void swap(T[] array, int i, int j) {
    T temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  protected static <T> void swap(List<T> collection, int index1, int index2) {
    T temp = collection.get(index1);
    collection.set(index1, collection.get(index2));
    collection.set(index2, temp);
  }

  protected <E> E[] getArray(Class<E> clazz, int size) {
    @SuppressWarnings("unchecked")
    E[] arr = (E[]) Array.newInstance(clazz, size);

    return arr;
  }
}
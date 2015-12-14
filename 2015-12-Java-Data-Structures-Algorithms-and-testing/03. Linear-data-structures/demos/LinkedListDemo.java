import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.addFirst("First");
    list.addLast("Last");
    list.add(1, "After First");
    list.add(2, "Before Last");
    list.add("Last Last");

    System.out.println(list);
    System.out.println(list.poll());

    System.out.println(list);
  }
}

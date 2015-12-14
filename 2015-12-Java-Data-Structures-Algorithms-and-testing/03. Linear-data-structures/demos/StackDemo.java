import java.util.LinkedList;

public class StackDemo {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.addFirst("First");
    list.addLast("Last");
    list.add(1, "After First");
    list.add(2, "Before Last");

    System.out.println(list);
  }
}

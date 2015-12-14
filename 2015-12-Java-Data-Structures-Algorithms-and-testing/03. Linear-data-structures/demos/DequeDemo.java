import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
  public static void main(String[] args) {
    Deque<String> deque = new LinkedList<>(); // ArrayDeque<>();

    deque.addLast("Last");
    deque.addFirst("First");

    System.out.println(deque.removeFirst());

    System.out.println(deque);
  }
}
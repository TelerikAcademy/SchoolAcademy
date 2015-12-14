import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    queue.add("Message One");
    queue.add("Message Two");
    queue.add("Message Three");
    queue.add("Message Four");

    while (queue.size() > 0) {
      String message = queue.poll();
      System.out.println(message);
    }

    System.out.println(queue);
  }
}
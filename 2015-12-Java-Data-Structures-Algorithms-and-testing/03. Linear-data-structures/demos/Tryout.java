public class Tryout {
  public static void main(String[] args) {
    MyLinkedList<Integer> list = new MyLinkedList<>();

    list.enqueue(12);
    list.enqueue(34);
    list.enqueue(56);
    list.enqueue(78);

    System.out.println(list.dequeue());
  }
}
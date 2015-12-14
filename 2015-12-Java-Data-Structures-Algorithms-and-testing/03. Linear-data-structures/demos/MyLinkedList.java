public class MyLinkedList<T> {
  private class Node{
    public T value;

    public Node next;
    public Node prev;

    public Node(T inputValue) {
      this.value = inputValue;
    }
  }

  public Node head;
  public Node tail;

  public void enqueue(T value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
      tail = newNode;
    }

    tail.next = newNode;
    tail = newNode;
  }

  public T dequeue() {
    Node head = this.head;
    this.head = head.next;

    return head.value;
  }
}
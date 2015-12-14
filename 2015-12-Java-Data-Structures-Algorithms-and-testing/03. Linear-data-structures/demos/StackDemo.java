import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    stack.push("First");
    stack.push("Last");

    System.out.println(stack.peek());
    System.out.println(stack);
  }
}

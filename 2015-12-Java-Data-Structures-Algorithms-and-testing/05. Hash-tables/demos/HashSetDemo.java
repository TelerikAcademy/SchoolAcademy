import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("Jordan");
    set.add("Steven");
    set.add("John");
    set.add("Mike");
    set.add("Jordan");

    System.out.println(set); //[Mike, Jordan, Steven]
    System.out.println(set.contains("Jordan")); // true

    set.remove("Jordan");
    System.out.println(set.contains("Jordan")); // false
  }
}
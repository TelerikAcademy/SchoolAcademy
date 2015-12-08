import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    System.out.println(list.add("Java"));
    list.add("C#");
    list.add("SQL");
    list.forEach(System.out::println);

    // Result:
    //   Java
    //   C#
    //   SQL
  }
}
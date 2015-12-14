import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class ListDemo {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Asgdsf");
    list.add("dfsgre");
    list.add(1, "sdfg");

    System.out.println(list.indexOf("sdfg"));
    System.out.println(String.format("List size: %s", list.size()));
    System.out.println(list);

    list.remove(0);
    System.out.println(list);

    Object[] arr = list.toArray();
    for (Object s : arr) {
      System.out.println(s);
    }
  }
}
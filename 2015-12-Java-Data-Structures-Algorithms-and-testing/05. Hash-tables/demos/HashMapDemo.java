import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  private static class PersonInfo {
    public int age;
    public String address;

    public PersonInfo(int age, String address) {
      this.age = age;
      this.address = address;
    }

    @Override
    public String toString() {
      return String.format("%s years old, from %s", this.age, this.address);
    }
  }

  public static void main(String[] args) {
    Map<String, PersonInfo> map = new HashMap<>();
    map.put("Steven", new PersonInfo(25, "Sofia"));
    map.put("John", new PersonInfo(18, "Plovdiv"));

    System.out.println(map.entrySet());
    System.out.println(map.keySet());
    System.out.println(map.values());
  }
}
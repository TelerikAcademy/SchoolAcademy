public class Foreach {
  public static void main(String[] args) {
    String[] days = new String[] {
        "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday", "Sunday"
    };

    for (String day : days) {
      System.out.println(day);
    }
  }
}

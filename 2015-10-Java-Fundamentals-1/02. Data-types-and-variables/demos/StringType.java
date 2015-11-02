public class StringType {
  public static void main(String[] args) {
    String firstName = "Ivan";
    String lastName = "Ivanov";
    System.out.printf("Hello, %s!%n", firstName);

    String fullName = firstName + " " + lastName;
    System.out.printf("Your full name is %s.%n", fullName);
  }
}

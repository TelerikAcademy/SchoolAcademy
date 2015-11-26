package people;

public class Person {
  private String name;
  private int age;
  private char gender;

  public Person(String name) {
    this(name, 0);
  }

  public Person(String name, int age) {
    this.setName(name);
    this.setAge(age);
  }

  public String getName() {
    return this.name;
  }

  public void setName(String value) {
    if (value == null) {
      throw new IllegalArgumentException("Name cannot be null");
    }

    if (value.length() < 2) {
      throw new IllegalArgumentException("Name must be longer than 2");
    }

    this.name = value;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int value) {
    if (value < 0) {
      throw new IllegalArgumentException("Age cannot be negative");
    }

    this.age = value;
  }
}
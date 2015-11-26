package people;

public class Student extends Person {
  private String school;

  public Student(String name, String school) {
    super(name);
    this.setSchool(school);
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String value) {
    this.school = value;
  }

  public String toString() {
    return String.format("I am %s and I am %s years old.", this.getName(), this.getAge());
  }
}
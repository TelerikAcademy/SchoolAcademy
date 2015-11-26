package people;

public class Employee extends Person {
  private String company;
  private double salary;

  public Employee(String name, int age) {
    this(name, age, "not employed", 0.0);
  }

  public Employee(String name, int age, String company) {
    this(name, age, company, 160.0);
  }

  public Employee(String name, int age, String company, double salary) {
    super(name, age);
    this.setCompany(company);
    this.setSalary(salary);
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
package animals;

import java.time.LocalDateTime;

public class Cat {
  private String name;
  private LocalDateTime dayOfBirth;

  public Cat(String name, LocalDateTime dateOfBirth) {
    this.setName(name);
    this.dayOfBirth = dateOfBirth;
  }

  public Cat(String name) {
    this(name, LocalDateTime.now());
  }

  public String getName() {
    return this.name;
  }

  private void setName(String value) {
    if (value == null || value.length() == 0) {
      throw new IllegalArgumentException("Invalid Name!");
    }
    this.name = value;
  }

  public int getAge() {
    return LocalDateTime.now().getYear() - this.dayOfBirth.getYear();
  }
}
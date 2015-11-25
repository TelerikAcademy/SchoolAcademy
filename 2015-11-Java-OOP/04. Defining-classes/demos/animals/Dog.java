package animals;

public class Dog {
  private String name;

  public Dog() {
    this("no name");
  }

  public Dog(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String bark() {
    return this.getName() + ": Bau-bau!";
  }

  public void play(Tail tail) {

    System.out.println("Im playing with my tail");
  }

  public void play(Ball ball) {

    System.out.println("Im playing with a ball");
  }

  public void play(Stick stick) {

    System.out.println("Im playing with a stick");
  }
}
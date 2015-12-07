package contracts;

public interface IClickable {
  String clickMe();
  void doSomething(int num);

  default void changeColor() {
    System.out.println(howAmI());
  }

  static String howAmI() {
    return "I'm Green!";
  }
}

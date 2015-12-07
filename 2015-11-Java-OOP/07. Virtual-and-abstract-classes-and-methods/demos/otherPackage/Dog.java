package otherPackage;

import contracts.IClickable;
import contracts.IMovable;

public class Dog implements IMovable, IClickable {

  @Override
  public void move(int deltaX, int deltaY) {

  }

  @Override
  public void doSomething(int num) {

  }

  @Override
  public String clickMe() {
    return "I'm strange";
  }
}

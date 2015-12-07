package models;

import contracts.ICanFly;

public class FlyingBunny
  extends WarriorBunny implements ICanFly {

  public FlyingBunny(int x, int y, int hp) {
    super(x, y, hp);
  }

  @Override
  public void fly() {
    System.out.println("Eeeeehoooo!");
  }
}
package geometry;

import contracts.IMesurable;
import contracts.IMovable;

public abstract class Shape2D
    implements IMovable, IMesurable {
  private int x;
  private int y;

  protected Shape2D(int x, int y) {
    this.setX(x);
    this.setY(y);
  }

  public int getX() {
    return x;
  }

  private void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  private void setY(int y) {
    this.y = y;
  }

  public abstract double getArea();

  public void move(int deltaX, int deltaY) {
    this.setX(this.getX() + deltaX);
    this.setY(this.getY() + deltaY);
  }

  @Override
  public void doSomething(int num) {
    System.out.println(num);
  }

  public String toString() {
    return String.format("Shape2D(%s, %s)", this.getX(), this.getY());
  }

  protected static class Validator {
    public static boolean isPositive(int value) {
      boolean isTrue = true;
      if (value <= 0) {
        isTrue = false;
      }

      return isTrue;
    }
  }
}
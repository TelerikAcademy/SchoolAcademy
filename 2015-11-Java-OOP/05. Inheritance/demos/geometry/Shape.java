package geometry;

public abstract class Shape {
  private int x;
  private int y;

  protected Shape(int x, int y) {
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

  public String toString() {
    return String.format("Shape(%s, %s)", this.getX(), this.getY());
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
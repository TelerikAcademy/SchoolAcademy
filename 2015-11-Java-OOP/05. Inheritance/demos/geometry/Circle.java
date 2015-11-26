package geometry;

public class Circle extends Shape {
  private static final double PI = Math.PI;
  private int radius;

  public Circle(int x, int y, int radius) {
    super(x, y);
    this.setRadius(radius);
  }

  public int getRadius() {
    return this.radius;
  }

  public void setRadius(int value) {
    if (!Validator.isPositive(value)) {
      throw new IllegalArgumentException("Radius must be a positiv integer");
    }

    this.radius = value;
  }

  @Override
  public double getArea() {
    return PI * this.getRadius() * this.getRadius();
  }

  public String toString() {
    return String.format("Circle(%s, %s), %s",
        this.getX(), this.getY(), this.getRadius());
  }
}
package geometry;

public class Rectangle extends Shape {
  private int width;
  private int height;

  public Rectangle(int x, int y, int width, int height) {
    super(x, y);
    this.setWidht(width);
    this.setHeight(height);
  }


  public int getWidth() {
    return this.width;
  }

  public void setWidht(int value) {
    if (!Validator.isPositive(value)) {
      throw new IllegalArgumentException("Widht must be > 0");
    }

    this.width = value;
  }

  public int getHeight() {
    return this.height;
  }

  public void setHeight(int value) {
    if (!Validator.isPositive((value))) {
      throw new IllegalArgumentException("Height must be > 0");
    }

    this.height = value;
  }

  @Override
  public double getArea() {
    return this.getWidth() * this.getHeight();
  }
}
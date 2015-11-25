package geometry;

public class Rectangle {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public void setHeight(double value) {
    this.height = value;
  }

  public double getArea() {
    return this.width * this.height;
  }
}
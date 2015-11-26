package otherPackage;

import geometry.Shape;

public class Triangle extends Shape {
  private int base;

  protected Triangle(int x, int y) {
    super(x, y);
  }

  private void setBase(int value) {
    if(!Validator.isPositive(value)) {

    }

    this.base = value;
  }

  @Override
  public double getArea() {
    return 0;
  }
}
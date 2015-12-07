package otherPackage;

import geometry.Shape2D;

public class Triangle extends Shape2D {
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
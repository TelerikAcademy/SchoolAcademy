package geometry;

import contracts.IMovable;

public class Square
    extends Rectangle implements IMovable {
  public Square(int x, int y, int size) {
    super(x, y, size, size);
  }

  @Override
  public double getArea() {
    return 0.1;
  }
}
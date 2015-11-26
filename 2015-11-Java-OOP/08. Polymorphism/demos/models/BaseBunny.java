package models;

import contracts.IBunny;

public abstract class BaseBunny implements IBunny {
  private int x;
  private int y;

  public BaseBunny(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public double hop(int numberOfTimes) {
    this.setX(numberOfTimes + this.getX());
    this.setY(numberOfTimes + this.getY());

    return Math.sqrt(numberOfTimes * numberOfTimes * 2);
  }
}

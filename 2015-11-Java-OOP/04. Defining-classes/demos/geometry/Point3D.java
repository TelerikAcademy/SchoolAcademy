package geometry;

public class Point3D {
  private double x;
  private double y;
  private double z;

  public Point3D(double x, double y, double z) {
    this.setX(x);
    this.setY(y);
    this.setZ(z);
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getZ() {
    return z;
  }

  public void setZ(double z) {
    this.z = z;
  }

  public double calcDistance(Point3D p) {
    return Math.sqrt(
        Math.pow(Math.sqrt(
          (this.getX() - p.getX()) * (this.getX() - p.getX()) +
          (this.getY() - p.getY()) * (this.getY() - p.getY())), 2) +
          (this.getZ() - p.getZ()) * (this.getZ() - p.getZ()));
  }
}
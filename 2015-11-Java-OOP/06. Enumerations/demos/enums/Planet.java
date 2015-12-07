package enums;

public enum Planet {
  MERCURY (3.303e+23, 2.4397e+6),
  VENUS   (4.869e+24, 6.0518e+6),
  EARTH   (5.976e+24, 6.37814e+6),
  MARS    (6.421e+23, 3.3972e+6),
  JUPITER (1.9e+27,   7.1492e+7),
  SATURN  (5.688e+26, 6.0268e+7),
  URANUS  (8.686e+25, 2.5559e+7),
  NEPTUNE (1.024e+26, 2.4746e+7);

  private final double mass;   // in kilograms
  private final double radius; // in meters

  Planet(double mass, double radius) {
    this.mass = mass;
    this.radius = radius;
  }

  private double mass() {
    return this.mass;
  }

  private double radius() {
    return this.radius;
  }

  // universal gravitational constant  (m3 kg-1 s-2)
  public static final double G = 6.67300e-11;

  public double surfaceGravity() {
    return G * mass / (radius * radius);
  }

  public double surfaceWeight(double otherMass) {
    return otherMass * surfaceGravity();
  }
}
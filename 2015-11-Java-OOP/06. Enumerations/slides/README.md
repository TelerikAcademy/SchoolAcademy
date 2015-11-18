<!-- section start -->

<!-- attr: { class:'slide-title', hasScriptWrapper:true } -->
# Enumerations
## Defining and Using Enumerated Types
<div class="signature">
    <p class="signature-course">Java OOP</p>
    <p class="signature-initiative">Telerik School Academy</p>
    <a href="http://academy.telerik.com" class="signature-link">http://academy.telerik.com</a>
</div>


<!-- section start -->

<!-- attr: { class:'slide-section', showInPresentation:true } -->
<!-- # Enumerations in Java
## Defining Enumerations -->

<!-- attr: { style:'font-size:0.85em' } -->
# Enumerations in Java
* `Enumerations` are special data type that enables for a variable to be a set of predefined constants
  * Declared by `enum` keyword in Java
  * The variable must be equal to one of the values

```java
public enum CompassDirections {
  NORTH, SOUTH, EAST, WEST
}
```
```java
class EnumExample {
  static void main(String[] args) {
    CompassDirections direction = CompassDirections.SOUTH;
    System.out.println(direction); // SOUTH

    direction = CompassDirections.valueOf("EAST");
    System.out.println(dir); // EAST
  }
}
```

<!-- attr: { class:'slide-section demo', showInPresentation:true } -->
<!-- # Enumerations -->
## [Demo]()


<!-- section start -->

<!-- attr: { class:'slide-section', showInPresentation:true } -->
<!-- # Using Enumerations
## How can Enumerations be used? -->

<!-- attr: { style:'font-size:0.75em' } -->
# Using Enumerations
```java
public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY 
}
```

```java
public class EnumTest {
    Day day;    
    public EnumTest(Day day) {
        this.day = day;
    }
    
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
              System.out.println("Mondays are bad."); break;
            case FRIDAY:
              System.out.println("Fridays are better."); break;
            case SATURDAY: 
            case SUNDAY: 
              System.out.println("Weekends are best."); break;
            default:
              System.out.println("Midweek days are so-so."); break;
        }
    } ...
```

<!-- attr: { showInPresentation:true, style:'font-size:0.9em' } -->
<!-- # Using Enumerations -->
```
    ...
    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();

        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();

        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();

        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();

        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
```

<!-- attr: { class:'slide-section demo', showInPresentation:true } -->
<!-- # Using Enumerations -->
## [Demo]()

<!-- section start -->

<!-- attr: { class:'slide-section', showInPresentation:true } -->
<!-- # The Power of Java Enums -->

<!-- attr: { style:'font-size:0.85em' } -->
# The Power of Java Enums
* Much more **powerful** than in other languages
* The enum class body can include **methods**, **constructors** and other **fields**
* All `enums` implicitly extend `java.lang.Enum`
  * They have a static `values()` method that returns an array containing all of the values of the enum

```java
for (Day d : Day.values()) {
  System.out.println(String.format("Days of the week %s", d));
}
```

<!-- attr: { showInPresentation:true, style:'font-size:0.85em' } -->
<!-- # The Power of Java Enums -->
```java
public enum Planet {
    MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);

    private final double mass;   // in kilograms
    private final double radius; // in meters
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    private double mass() { return mass; }
    private double radius() { return radius; }

    // universal gravitational constant  (m3 kg-1 s-2)
    public static final double G = 6.67300E-11;
    ...
```

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size:0.85em' } -->
<!-- # The Power of Java Enums -->
```
    ...
    double surfaceGravity() {
        return G * mass / (radius * radius);
    }

    double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }
}
```
```
public static void main(String[] args) {
    if (args.length != 1) {
        System.err.println("Usage: java <class_name> <earth_weight>");
        System.exit(-1);
    }
    double earthWeight = Double.parseDouble(args[0]);
    double mass = earthWeight / Planet.EARTH.surfaceGravity();
    for (Planet p : Planet.values())
       System.out.printf("Your weight on %s is %f%n",
                         p, p.surfaceWeight(mass));
}
```


<!-- section start -->

<!-- attr: { id:'questions', class:'slide-section' } -->
# Questions
## Enumerations
[link to Telerik Academy Forum](http://telerikacademy.com/Forum/Category/12/telerik-school-academy)
import contracts.*;
import geometry.*;

import java.util.Objects;

public class GeometryStartup {
  public static void main(String[] args) {
//    Circle c1 = new Circle(0, 0, 10);
//    Rectangle r1 = new Rectangle(0, 0, 10, 20);
//    Object s1 = new Square(0, 0, 10);
//
//    c1.move(10, 10);
//
//    System.out.println(c1);
//    System.out.println(c1.getArea());
//    System.out.println(r1.getArea());
//
//    System.out.println(((Square) s1).getArea());
//
//    r1.changeColor();

    IMesurable[] shapes = {
        new Circle(0, 0, 10),
        new Rectangle(0, 0, 10, 15),
        new Square(10, 10, 20),
        new Circle(0, 0, 20)
    };

    for (IMesurable shape : shapes) {
      System.out.println(shape.getArea());
    }


  }
}
import animals.*;
import geometry.*;

import java.time.LocalDateTime;

public class Startup {
  public static void main(String[] args) {
    //Dog.LUCKY_NUMBER;

//    Cat gruicho = new Cat("Gruicho", 1);
//    Cat prokopi = new Cat("Prokopi", 2);
//
//    System.out.println(gruicho.getName());
//    System.out.println(prokopi.getName());

      Dog[] dogs = { new Dog("Sharo"), new Dog("Rex"), new Dog() };


    for (Dog dog : dogs) {
      System.out.println(dog.bark());
    }

//    Cat gruicho = new Cat("Gruicho", LocalDateTime.of(2012, 6, 12, 10, 30));
//    System.out.println(gruicho.getAge());
//
//    Cat kitten = new Cat("baby");
//    System.out.println(kitten.getAge());

  }
}
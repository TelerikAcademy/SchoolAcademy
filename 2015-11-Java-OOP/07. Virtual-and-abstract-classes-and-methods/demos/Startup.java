import people.*;

import java.util.ArrayList;
import java.util.List;

public class Startup {
  public static void main(String[] args) {
    Student stamat = new Student("Stamat", "Telerik Academy");

    System.out.println(stamat.toString());


    Object obj = new Object();
    Employee emp = new Employee("Ime", 32, "Telerik", 800.0);

    List<Integer> list = new ArrayList<>();
  }
}
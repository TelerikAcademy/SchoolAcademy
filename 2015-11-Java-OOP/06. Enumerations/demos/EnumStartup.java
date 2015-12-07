import enums.DayOfWeek;
import enums.Gender;

public class EnumStartup {
  public static void main(String[] args) {
    java.time.DayOfWeek javaDow = java.time.DayOfWeek.THURSDAY;
    enums.DayOfWeek myDow = enums.DayOfWeek.FRIDAY;

    //System.out.println(myDow);

    myDow = DayOfWeek.valueOf("WEDNESDAY");
    //System.out.println(myDow);


    for (Gender gender : Gender.values()) {
      System.out.println(gender);
    }

  }
}
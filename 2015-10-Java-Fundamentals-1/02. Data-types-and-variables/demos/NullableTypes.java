public class NullableTypes {
  public static void main(String[] args) {
    System.out.println("----------------------------------------");

    Integer someInteger = null;
    //int someInteger = null;
    System.out.printf("This is the integer with Null value -> %d%n",
                      someInteger);
    someInteger = 5;
    System.out.printf("This is the integer with value 5 -> %d%n",
                      someInteger);

    System.out.println("----------------------------------------");

    Double someDouble;
    //double someDouble;
    someDouble = null;
    System.out.printf("This is the double with Null value -> %f%n", 
                      someDouble);

    someDouble = 2.5;
    System.out.printf("This is the double with value 2.5 -> %f%n",
                      someDouble);

    //this will throw an NullPointerException
    Integer value = null;
    System.out.println(value.intValue());
  }
}

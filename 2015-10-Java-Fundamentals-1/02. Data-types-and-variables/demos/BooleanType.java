public class BooleanType {
  public static void main(String[] args) {
    int n1 = 1;
    int n2 = 2;
    
    boolean greater = (n1 > n2);
    writeLine(greater);  // false

    boolean equalN1To1 = (n1 == 1);
    writeLine(equalN1To1);    // true
  }

  public static void writeLine(Object obj) {
    System.out.println(obj);
  }
}

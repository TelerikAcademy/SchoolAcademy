public class BooleanType {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        boolean greaterAB = (a > b);
        WriteLine(greaterAB);  // false

        boolean equalA1 = (a == 1);
        WriteLine(equalA1);    // true
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }
}

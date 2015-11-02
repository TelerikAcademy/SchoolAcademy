public class BooleanType {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        boolean greaterAB = (a > b);
        writeLine(greaterAB);  // false

        boolean equalA1 = (a == 1);
        writeLine(equalA1);    // true
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }
}

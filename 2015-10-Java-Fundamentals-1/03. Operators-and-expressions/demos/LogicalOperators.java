public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        writeLine(a && b); // False
        writeLine(a || b); // True
        writeLine(a ^ b); // True
        writeLine(!b); // True
        writeLine(b || true); // True
        writeLine(b && true); // False
        writeLine(a || true); // True
        writeLine(a && true); // True
        writeLine(!a); // False
        writeLine((5 > 7) ^ (a == b)); // False
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }
}
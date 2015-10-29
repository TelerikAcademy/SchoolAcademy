public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        WriteLine(a && b); // False
        WriteLine(a || b); // True
        WriteLine(a ^ b); // True
        WriteLine(!b); // True
        WriteLine(b || true); // True
        WriteLine(b && true); // False
        WriteLine(a || true); // True
        WriteLine(a && true); // True
        WriteLine(!a); // False
        WriteLine((5 > 7) ^ (a == b)); // False
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }
}
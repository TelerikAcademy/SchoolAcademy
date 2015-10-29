import java.text.MessageFormat;

public class Expressions {
    public static void main(String[] args) {
        int r = (150-20) / 2 + 5;
        WriteLine("r={0}", r); // 70

        // Expression for calculation of circle area
        double surface = Math.PI * r * r;
        WriteLine("surface={0}", surface); // 15393,80400259

        // Expression for calculation of circle perimeter
        double perimeter = 2 * Math.PI * r;
        WriteLine("perimeter={0}", perimeter); // 439,822971502571

        // Expression of type int (evaluated at compile time)
        int a = 2 + 3; // a = 5
        WriteLine("a={0}", a);

        // Expression of type int (evaluated at runtime)
        int b = (a+3) * (a-4) + (2*a + 7) / 4;  // b = 12
        WriteLine("b={0}", b);

        // Expression of type bool (evaluated at runtime)
        boolean greater = (a > b) || ((a == 0) && (b == 0)); // greater = false
        WriteLine("greater={0}", greater);

        // Expression of type double (evaluated at runtime)
        double c = (double)(a + b) / b; // c = 1.41666666666667
        WriteLine("c={0}", c);

        // Expression of type double (evaluated as int first)
        double d = (double)((a + b) / b); // d = 1
        WriteLine("d={0}", d);
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }

    public static void WriteLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
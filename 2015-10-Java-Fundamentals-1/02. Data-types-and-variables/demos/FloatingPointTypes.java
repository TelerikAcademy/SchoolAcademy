import java.math.BigDecimal;
import java.text.MessageFormat;

public class FloatingPointTypes {
    public static void main(String[] args) {
        float floatPI = 3.141592653589793238f;
        double doublePI = 3.141592653589793238;
        writeLine("Float PI is: {0}", floatPI);
        writeLine("Double PI is: {0}", doublePI);

        // Example of comparison abnormality
        double a = 1.0f;
        double b = 0.33f;
        double sum = 1.33f;
        boolean equal = (a + b == sum);
        writeLine("Float calculation: a+b={0}  sum={1}  equal={2}",
                a + b, sum, equal);

        // Decimal numbers do not have comparison abnormalities
        BigDecimal aDecimal =   BigDecimal.valueOf(1.0);
        BigDecimal bDecimal =   BigDecimal.valueOf(0.33);
        BigDecimal sumDecimal = BigDecimal.valueOf(1.33);
        boolean equalDecimal = (aDecimal.add(bDecimal).equals(sumDecimal));
        writeLine("Decimal calculation: a+b={0}  sum={1}  equal={2}",
                aDecimal.add(bDecimal), sumDecimal, equalDecimal);

    }

    public static void writeLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}

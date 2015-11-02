import java.math.BigDecimal;
import java.text.MessageFormat;

public class FloatingPointTypes {
  public static void main(String[] args) {
    float floatPi = 3.141592653589793238f;
    double doublePi = 3.141592653589793238;
    writeLine("Float PI is: {0}", floatPi);
    writeLine("Double PI is: {0}", doublePi);

    // Example of comparison abnormality
    double f1 = 1.0f;
    double f2 = 0.33f;
    double sum = 1.33f;
    boolean equal = (f1 + f2 == sum);
    writeLine("Float calculation: f1 + f2 = {0}  sum={1}  equal={2}",
              f1 + f2, sum, equal);

    // Decimal numbers do not have comparison abnormalities
    BigDecimal d1 =   BigDecimal.valueOf(1.0);
    BigDecimal d2 =   BigDecimal.valueOf(0.33);
    BigDecimal sumD1D2 = BigDecimal.valueOf(1.33);
    boolean equalDecimal = (d1.add(d2).equals(sumD1D2));
    writeLine("Decimal calculation: a+b={0}  sum={1}  equal={2}",
              d1.add(d2), sumD1D2, equalDecimal);

  }

  public static void writeLine(String format, Object... obj) {
    MessageFormat form = new MessageFormat(format);
    System.out.println(form.format(obj));
  }
}

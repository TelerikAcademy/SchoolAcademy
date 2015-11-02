import java.text.MessageFormat;

public class IntegerTypes {
    public static void main(String[] args) {
        byte centuries = 20;    // Usually a small number
        short years = 2000;
        int days = 730480;
        long hours = 17531520; // May be a very big number

        writeLine(
            "{0} centuries is {1} years, or {2} days, or {3} hours.",
            centuries, years, days, hours);
    }

    public static void writeLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}

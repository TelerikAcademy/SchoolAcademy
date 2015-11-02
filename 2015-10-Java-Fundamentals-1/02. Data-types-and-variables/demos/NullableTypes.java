import java.text.MessageFormat;

public class NullableTypes {
    public static void main(String[] args) {

        writeLine("----------------------------------------");

        Integer someInteger = null;
        //int someInteger = null;
        writeLine(
                "This is the integer with Null value -> " + someInteger);
        someInteger = 5;
        writeLine(
                "This is the integer with value 5 -> " + someInteger);


        writeLine("----------------------------------------");

        Double someDouble;
        //double someDouble;
        someDouble = null;
        writeLine(
                "This is the double with Null value -> " + someDouble);
        someDouble = 2.5;
        writeLine(
                "This is the double with value 2.5 -> " + someDouble);

        Integer value = null;
        writeLine(value.intValue());
        // Console.writeLine(value.Value); // This will cause an exception
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }

    public static void writeLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
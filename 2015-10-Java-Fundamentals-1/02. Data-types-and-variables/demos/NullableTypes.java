import java.text.MessageFormat;

public class NullableTypes {
    public static void main(String[] args) {

        WriteLine("----------------------------------------");

        Integer someInteger = null;
        //int someInteger = null;
        WriteLine(
                "This is the integer with Null value -> " + someInteger);
        someInteger = 5;
        WriteLine(
                "This is the integer with value 5 -> " + someInteger);


        WriteLine("----------------------------------------");

        Double someDouble;
        //double someDouble;
        someDouble = null;
        WriteLine(
                "This is the double with Null value -> " + someDouble);
        someDouble = 2.5;
        WriteLine(
                "This is the double with value 2.5 -> " + someDouble);

        Integer value = null;
        WriteLine(value.intValue());
        // Console.WriteLine(value.Value); // This will cause an exception
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }

    public static void WriteLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
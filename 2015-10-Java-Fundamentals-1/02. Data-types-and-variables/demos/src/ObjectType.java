import java.text.MessageFormat;

public class ObjectType {
    public static void main(String[] args) {
        Object dataContainer = 5;
        Write("The value of dataContainer is: ");
        WriteLine(dataContainer);

        dataContainer = "Five";
        Write("The value of dataContainer is: ");
        WriteLine(dataContainer);
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }

    public static void WriteLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}

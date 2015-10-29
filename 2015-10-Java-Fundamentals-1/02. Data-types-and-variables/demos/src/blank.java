import java.text.MessageFormat;

public class blank {
    public static void main(String[] args) {

    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }

    public static void WriteLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}

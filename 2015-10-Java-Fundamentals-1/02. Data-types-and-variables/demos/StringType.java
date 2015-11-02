import java.text.MessageFormat;

public class StringType {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String lastName = "Ivanov";
        writeLine("Hello, {0}!\n", firstName);

        String fullName = firstName + " " + lastName;
        writeLine("Your full name is {0}.", fullName);
    }

    public static void writeLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}

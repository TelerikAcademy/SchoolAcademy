import java.text.MessageFormat;

public class StringLiterals {
    public static void main(String[] args) {
// Here is a string literal using escape sequences
        String quotation = "\"Hello, Jude\", he said.";
        String path = "C:\\WINNT\\Darts\\Darts.exe";
        WriteLine(quotation);
        WriteLine(path);

        WriteLine("This is a multi-line text,\n" +
            "represented as string.");
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }

    public static void WriteLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}

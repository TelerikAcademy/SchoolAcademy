import java.text.MessageFormat;

public class StringLiterals {
    public static void main(String[] args) {
// Here is a string literal using escape sequences
        String quotation = "\"Hello, Jude\", he said.";
        String path = "C:\\WINNT\\Darts\\Darts.exe";
        writeLine(quotation);
        writeLine(path);

        writeLine("This is a multi-line text,\n" +
            "represented as string.");
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }

    public static void writeLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}

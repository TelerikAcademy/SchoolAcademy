import java.text.MessageFormat;

public class CharacterType {
    public static void main(String[] args) {
        char symbol = 'a';
        writeLine("The code of '{0}' is: {1}",
                symbol, (int) symbol);

        symbol = 'b';
        writeLine("The code of '{0}' is: {1}",
                symbol, (int) symbol);

        symbol = 'A';
        writeLine("The code of '{0}' is: {1}",
                symbol, (int) symbol);

        symbol = 'ù'; // Cyrillic letter 'sht'
        writeLine("The code of '{0}' is: {1}",
               symbol, (int) symbol);
    }

    public static void writeLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}

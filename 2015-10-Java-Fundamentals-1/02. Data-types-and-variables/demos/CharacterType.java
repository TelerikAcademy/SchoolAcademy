import java.text.MessageFormat;

public class CharacterType {
    public static void main(String[] args) {
        char symbol = 'a';
        WriteLine("The code of '{0}' is: {1}",
                symbol, (int) symbol);

        symbol = 'b';
        WriteLine("The code of '{0}' is: {1}",
                symbol, (int) symbol);

        symbol = 'A';
        WriteLine("The code of '{0}' is: {1}",
                symbol, (int) symbol);

        symbol = 'ù'; // Cyrillic letter 'sht'
        WriteLine("The code of '{0}' is: {1}",
               symbol, (int) symbol);
    }

    public static void WriteLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}

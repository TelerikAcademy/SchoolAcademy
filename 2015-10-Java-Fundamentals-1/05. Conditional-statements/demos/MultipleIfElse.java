import java.text.MessageFormat;
import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        Write("Please enter a character: ");

        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        if (ch == 'A' || ch == 'a') {
            writeLine("Vowel [ei]");
        }
        else if (ch == 'E' || ch == 'e') {
            writeLine("Vowel [i:]");
        }
        else if (ch == 'I' || ch == 'i') {
            writeLine("Vowel [ai]");
        }
        else if (ch == 'O' || ch == 'o') {
            writeLine("Vowel [ou]");
        }
        else if (ch == 'U' || ch == 'u') {
            writeLine("Vowel [ju:]");
        }
        else {
            writeLine("Consonant");
        }
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }
}
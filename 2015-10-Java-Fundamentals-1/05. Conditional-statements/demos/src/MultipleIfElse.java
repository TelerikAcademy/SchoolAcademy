import java.text.MessageFormat;
import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        Write("Please enter a character: ");

        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        if (ch == 'A' || ch == 'a') {
            WriteLine("Vowel [ei]");
        }
        else if (ch == 'E' || ch == 'e') {
            WriteLine("Vowel [i:]");
        }
        else if (ch == 'I' || ch == 'i') {
            WriteLine("Vowel [ai]");
        }
        else if (ch == 'O' || ch == 'o') {
            WriteLine("Vowel [ou]");
        }
        else if (ch == 'U' || ch == 'u') {
            WriteLine("Vowel [ju:]");
        }
        else {
            WriteLine("Consonant");
        }
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }
}
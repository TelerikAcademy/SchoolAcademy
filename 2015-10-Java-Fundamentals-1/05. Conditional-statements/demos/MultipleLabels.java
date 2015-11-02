import java.text.MessageFormat;
import java.util.Scanner;

public class MultipleLabels {
    public static void main(String[] args) {
        Write("Please enter some animal: ");

        Scanner scanner = new Scanner(System.in);
        String animal = scanner.next();

        switch (animal)
        {
            case "dog":
            case "cat":
            case "cow":
                writeLine("MAMMAL");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                writeLine("REPTILE");
                break;
            case "hawk":
            case "sparrow":
            case "dove":
                writeLine("BIRD");
                break;
            default:
                writeLine("I don't know this animal!");
                break;
        }
    }

    public static void Write(Object obj) {
        System.out.print(obj);
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }
}
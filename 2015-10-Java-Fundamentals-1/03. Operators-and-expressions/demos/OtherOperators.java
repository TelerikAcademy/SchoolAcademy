import java.text.MessageFormat;

public class OtherOperators {
    public static void main(String[] args) {
        String first = "First";
        String second = "Second";
        writeLine(first + second); // FirstSecond

        String output = "The number is : ";
        int number = 5;
        writeLine(output + number); // The number is : 5

        int a = 6;
        int b = 4;
        writeLine(a > b ? "a > b" : "b >= a"); // a>b
        writeLine((int) a); // 6

        int c = b = 3; // b=3 and c=3
        writeLine(c); // 3
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }
}
import java.text.MessageFormat;

public class OtherOperators {
    public static void main(String[] args) {
        String first = "First";
        String second = "Second";
        WriteLine(first + second); // FirstSecond

        String output = "The number is : ";
        int number = 5;
        WriteLine(output + number); // The number is : 5

        int a = 6;
        int b = 4;
        WriteLine(a > b ? "a > b" : "b >= a"); // a>b
        WriteLine((int) a); // 6

        int c = b = 3; // b=3 and c=3
        WriteLine(c); // 3
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }
}
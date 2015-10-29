import java.text.MessageFormat;

public class Foreach {
    public static void main(String[] args) {
        String[] days = new String[] {
                "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"
        };

        for (String day : days) {
            WriteLine(day);
        }
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }
}
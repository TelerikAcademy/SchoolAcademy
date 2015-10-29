import java.text.MessageFormat;

public class DaysOfWeek {
    public static void main(String[] args) {
        String[] daysOfWeek = new String[] {
            "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday", "Sunday"
        };

        WriteLine(daysOfWeek.length);
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }
}
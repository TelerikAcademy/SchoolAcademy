import java.text.MessageFormat;

public class DaysOfWeek {
    public static void main(String[] args) {
        String[] daysOfWeek = new String[] {
            "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday", "Sunday"
        };

        writeLine(daysOfWeek.length);
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }
}
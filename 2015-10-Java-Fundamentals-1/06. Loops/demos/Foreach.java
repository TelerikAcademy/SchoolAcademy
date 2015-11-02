import java.text.MessageFormat;

public class Foreach {
    public static void main(String[] args) {
        String[] days = new String[] {
                "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"
        };

        for (String day : days) {
            writeLine(day);
        }
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }
}
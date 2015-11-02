import java.text.MessageFormat;

public class AssigningValues {
    public static void main(String[] args) {
        int firstValue = 5;
        int secondValue;
        int thirdValue;

        // Using an already declared variable:
        secondValue = firstValue;

        // The following cascade calling assigns
        // 3 to firstValue and then firstValue
        // to thirdValue, so both variables have
        // the value 3 as a result:
        thirdValue = firstValue = 3;

        // This is how we use a literal expression:
        float heightInMeters = 1.74f;

        // Here we use an already initialized variable:
        String greeting = "Hello World!";
        String message = greeting;

        writeLine("{0}\n{1}\n{2}\n{3}\n{4}\n{5}",
                firstValue, secondValue, thirdValue,
                heightInMeters, greeting, message);
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }

    public static void writeLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}

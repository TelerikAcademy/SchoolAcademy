import java.text.MessageFormat;

public class TypeConversions {
    public static void main(String[] args) {
        float heightInMeters = 1.74f; // Explicit conversion
        double maxHeight = heightInMeters; // Implicit conversion

        double minHeight = (double) heightInMeters; // Explicit conversion (not required)

        float actualHeight = (float) maxHeight; // Explicit conversion

        //float maxHeightFloat = maxHeight; // Compilation error!

        int numberOfClients = 10;
        Object numberOfThings = numberOfClients;
        // The following type casting is allowed because
        // numberOfThings actually contains int value
        int numberOfSellers = (int) numberOfThings;

        // The following would not cause a compilation error
        // but during run-time will break the program:
        //double sellingPrice = (double)numberOfThings;

        WriteLine("{0}\n{1}\n{2}\n{3}\n{4}\n{5}",
                heightInMeters, maxHeight, minHeight, actualHeight,
                numberOfClients, numberOfSellers);
    }

    public static void WriteLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
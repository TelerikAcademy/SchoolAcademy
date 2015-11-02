import java.text.MessageFormat;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        String[] beers = { "Zagorka", "Ariana", "Shumensko",
                "Astika", "Kamenitza", "Bolyarka", "Amstel"
        };
        Arrays.sort(beers);

        String target = "Astika";
        int index = Arrays.binarySearch(beers, target);
        writeLine("{0} is found at index {1}.", target, index);
        //// Result: Astika is found at index 2.

        target = "Heineken";
        index = Arrays.binarySearch(beers, target);
        writeLine("{0} is not found (index={1}).", target, index);
        //// Result: Heineken is not found (index=-5).
    }

    public static void writeLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
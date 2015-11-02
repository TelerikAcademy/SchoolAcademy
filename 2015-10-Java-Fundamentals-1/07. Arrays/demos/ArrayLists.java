import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList();
        String[] arrayOfStrings = { "Pesho", "Ivan", "Dobri", "Gosho" };
        for (String str : arrayOfStrings) {
            listOfStrings.add(str);
        }

        writeLine("Using \"foreach\" loop to traverse the List");
        writeLine("------------------------------------------------------------");
        for (String str : listOfStrings) {
            writeLine(str);
        }

        writeLine("------------------------------------------------------------");
        writeLine("Using \"for\" loop to traverse the List");
        writeLine("------------------------------------------------------------");
        for (int i = 0; i < listOfStrings.size(); i++) {
            writeLine(listOfStrings.get(i));
        }

        System.out.println();
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }
}
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

        WriteLine("Using \"foreach\" loop to traverse the List");
        WriteLine("------------------------------------------------------------");
        for (String str : listOfStrings) {
            WriteLine(str);
        }

        WriteLine("------------------------------------------------------------");
        WriteLine("Using \"for\" loop to traverse the List");
        WriteLine("------------------------------------------------------------");
        for (int i = 0; i < listOfStrings.size(); i++) {
            WriteLine(listOfStrings.get(i));
        }

        System.out.println();
    }

    public static void WriteLine(Object obj) {
        System.out.println(obj);
    }
}
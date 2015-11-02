import java.text.MessageFormat;
import java.util.Scanner;

public class ExchangeBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        writeLine(PadLeft(Integer.toBinaryString(number), 32, '0'));

        int mask = 1 << 3;
        int thirdBit = (number & mask) >> 3;

        mask = 1 << 24;
        int twentyFourthBit = (number & mask) >> 24;

        if (thirdBit == twentyFourthBit) {
            writeLine(number);
            return;
        }

        if (thirdBit == 0) {
            //put 0 in 24th position
            mask = ~(1 << 24);
            number = number & mask;
        }
        else if (thirdBit == 1) {
            //put 1 in 24th position
            mask = 1 << 24;
            number = number | mask;
        }

        if (twentyFourthBit == 0) {
            //put 0 in third position
            mask = ~(1 << 3);
            number = number & mask;
        }
        else if (twentyFourthBit == 1) {
            //put 1 in third position
            mask = 1 << 3;
            number = number | mask;
        }

        writeLine(PadLeft(Integer.toBinaryString(number), 32, '0'));
    }

    public static void writeLine(Object obj) {
        System.out.println(obj);
    }

    public static String PadLeft(String str, int len, char ch) {
        return String.format("%32s", str).replace(' ', '0');
    }
}
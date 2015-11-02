import java.text.MessageFormat;

public class HappyNumbers {
    public static void main(String[] args) {
        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 0; d <= 9; d++) {
                        if ((a + b) == (c + d)) {
                            writeLine("{0}{1}{2}{3}", a, b, c, d);
                        }
                    }
                }
            }
        }
    }

    public static void writeLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
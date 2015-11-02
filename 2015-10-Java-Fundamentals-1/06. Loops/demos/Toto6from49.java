import java.text.MessageFormat;

public class Toto6from49 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i1 = 1; i1 <= 44; i1++) {
            for (int i2 = i1 + 1; i2 <= 45; i2++) {
                for (int i3 = i2 + 1; i3 <= 46; i3++) {
                    for (int i4 = i3 + 1; i4 <= 47; i4++) {
                        for (int i5 = i4 + 1; i5 <= 48; i5++) {
                            for (int i6 = i5 + 1; i6 <= 49; i6++) {
                                {
                                    writeLine("{0} {1} {2} {3} {4} {5}", i1, i2, i3, i4, i5, i6);
                                    // Try to comment the above row to speed up the program
                                    counter++;
                                }
                            }
                        }
                    }
                }
            }
        }

        writeLine("{0} combinations", counter);
    }

    public static void writeLine(String format, Object... obj) {
        MessageFormat form = new MessageFormat(format);
        System.out.println(form.format(obj));
    }
}
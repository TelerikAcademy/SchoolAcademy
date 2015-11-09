import java.util.Calendar;
import java.util.Locale;

public class SystemOutPrintfDatesDemo {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
  
    System.out.format("%tB %te, %tY%n", calendar, calendar, calendar);
    System.out.format(Locale.forLanguageTag("BG"), "%tB %te, %tY%n", calendar, calendar, calendar);
    System.out.format(Locale.CHINA, "%tB %te, %tY%n", calendar, calendar, calendar);
    System.out.format("%tl:%tM %tp%n", calendar, calendar, calendar);
    System.out.format("%tD%n", calendar);
  }
}

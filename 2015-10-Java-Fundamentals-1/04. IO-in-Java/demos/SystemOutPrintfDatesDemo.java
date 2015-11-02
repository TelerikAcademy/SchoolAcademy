import java.util.*;

public class SystemOutPrintfDatesDemo {
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();

		System.out.format("%tB %te, %tY%n", c, c, c);
		System.out.format(Locale.forLanguageTag("BG"), "%tB %te, %tY%n", c, c, c);
		System.out.format(Locale.CHINA, "%tB %te, %tY%n", c, c, c);
		System.out.format("%tl:%tM %tp%n", c, c, c);
		System.out.format("%tD%n", c);

	}

}

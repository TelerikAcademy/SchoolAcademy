public class SystemOutPrintfFloatingPointNumbersDemo {
	public static void main(String[] args){
		double pi = Math.PI;
		System.out.format("%f%n", pi);
		System.out.format("%.3f%n", pi);
		System.out.format("%10.3f%n", pi);
		System.out.format("%-10.3f%n", pi);
	}
}

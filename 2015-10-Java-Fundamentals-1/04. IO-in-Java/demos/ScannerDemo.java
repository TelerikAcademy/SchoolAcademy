import java.util.*;

class ScannerDemo {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		double doubleNumber = scanner.nextDouble();	
		String str = scanner.next();



		System.out.printf("Number: %d%nFloating-point number: %f%nString: %s", 
				number, 
				doubleNumber, 
				str);	
	}
}

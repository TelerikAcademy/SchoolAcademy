import java.util.ArrayList;
import java.util.List;

public class PrimesInInterval {
  public static void main(String[] args) {
    List<Integer> primes = findPrimes(10, 100);
    System.out.println(primes);
  }

  static List<Integer> findPrimes(int start, int end) {
    List<Integer> primesList = new ArrayList<>();
    for (int num = start; num <= end; num++) {
      boolean prime = true;
      for (int div = 2; div <= Math.sqrt(num); div++) {
        if (num % div == 0) {
          prime = false;
          break;
        }
      }

      if (prime) {
        primesList.add(num);
      }
    }

    return primesList;
  }
}
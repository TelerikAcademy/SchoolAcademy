import java.util.ArrayList;
import java.util.List;

public class PrimesLiveDemo {
  public static void main(String[] args) {
    List<Integer> primes = findPrimes(10, 100);
    System.out.println(primes);
  }

  private static List<Integer> findPrimes(int start, int end) {
    List<Integer> primes = new ArrayList<>();
    for (int i = start; i <= end; i++) {
      if (isPrime(i)) {
        primes.add(i);
      }
    }

    return primes;
  }

  private static boolean isPrime(int num) {
    boolean isPrime = true;
    for (int div = 2; div <= Math.sqrt(num); div++) {
      if (num % div == 0) {
        isPrime = false;
        break;
      }
    }

    return isPrime;
  }
}
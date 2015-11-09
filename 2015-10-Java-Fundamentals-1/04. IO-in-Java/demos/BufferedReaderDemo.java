import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferedReaderDemo {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String line = reader.readLine();

    System.out.printf("Line: %s%n", line);

    int number = Integer.parseInt(line);
    System.out.printf("Number: %d%n", number);
  }
}

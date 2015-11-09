import java.io.IOException;
import java.io.InputStreamReader;

class InputStreamReaderDemo {
  public static void main(String[] args) throws IOException {
    /* reading a single character*/
    InputStreamReader reader = new InputStreamReader(System.in);
    char character = (char)reader.read();
    System.out.println("Character: " + character);
  }
}


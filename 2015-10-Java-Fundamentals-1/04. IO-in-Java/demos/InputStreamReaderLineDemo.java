import java.io.IOException;
import java.io.InputStreamReader;

class InputStreamReaderLineDemo {
  public static void main(String[] args) throws IOException {
    /* reading a single character */
    InputStreamReader reader = new InputStreamReader(System.in);

    char[] bytes = new char[500];
    
    System.out.print("Enter a line: ");
    int bytesReadCount = reader.read(bytes);
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < bytesReadCount; i ++) {
      builder.append((char)bytes[i]);
    }

    System.out.println("Line: " + builder.toString());
  }
}


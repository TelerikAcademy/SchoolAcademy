import java.io.*;

class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException{
		/* reading a single character */
		InputStreamReader reader = new InputStreamReader(System.in);
		char c = (char)reader.read();
		System.out.println("Character: " + c);
	}
}


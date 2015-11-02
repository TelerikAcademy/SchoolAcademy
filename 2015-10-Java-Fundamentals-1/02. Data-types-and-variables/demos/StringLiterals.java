public class StringLiterals {
  public static void main(String[] args) {
    // Here is a string literal using escape sequences
    String quotation = "\"Hello, Jude\", he said.";
    String path = "C:\\WINNT\\Darts\\Darts.exe";
    System.out.println(quotation);
    System.out.println(path);
    System.out.println("This is a multi-line text,\n" 
                       + "represented as string.");
  }
}

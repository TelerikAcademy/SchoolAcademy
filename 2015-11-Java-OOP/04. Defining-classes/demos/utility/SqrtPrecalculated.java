package utility;

public class SqrtPrecalculated {
  public static int MAX_VALUE = 10000;

  private static double[] squares;

  static {
    squares = new double[MAX_VALUE];
    for (int i = 0; i < squares.length; i++) {
      squares[i] = Math.sqrt(i);
    }
  }

  public static double getSqrt(int value) {
//    if (squares[value] == 0.0) {
//      squares[value] = Math.sqrt(value);
//    }

    return squares[value];
  }
}
import javax.sound.midi.Soundbank;
import java.lang.reflect.Type;

public class TheQueensProblem {
  static final

  static int[][] board;
  static int size;
  static int counter = 0;

  static void putQueens(int row) {
    if (row >= size) {
      // printSolution();
      counter++;
      return;
    }

    for (int col = 0; col < size; col++) {
      if (canPlaceQueen(row, col)) {
        markAllAttackedPositions(row, col);

        putQueens(row + 1);

        unmarkAllAttackedPositions(row, col);
      }
    }
  }

  private static boolean canPlaceQueen(int row, int col) {
    return board[row][col] == 0;
  }

  private static void markAllAttackedPositions(int row, int col) {
    genericMarkPositions(row, col, 1);
    board[row][col] += 'N';
  }

  private static void unmarkAllAttackedPositions(int row, int col) {
    genericMarkPositions(row, col, -1);
    board[row][col] -= 'N';
  }

  private static void genericMarkPositions(int row, int col, int num) {
    for (int i = 0; i < size; i++) {
      if (i >= row) {
        board[i][col] += num; // mark vertical
      }

      if (col + i < size && row + i < size) {
        board[row + i][col + i] += num; // mark right diagonal
      }

      if (row + i < size && col - i >= 0) {
        board[row + i][col - i] += num; // mark left diagonal
      }
    }
  }

  private static void printSolution() {
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        System.out.print(String.format("| %s ", (char)board[row][col]));
      }

      System.out.println();
    }

    System.out.println();
  }

  public static void solve(int inputSize) {
    size = inputSize;
    board = new int[size][size];
    putQueens(0);
    System.out.println(counter);
  }

  public static void main(String[] args) {
    TheQueensProblem.solve(12);
  }
}
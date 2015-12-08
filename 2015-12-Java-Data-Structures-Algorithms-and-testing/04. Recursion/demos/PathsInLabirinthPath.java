import java.util.ArrayList;
import java.util.List;

public class PathsInLabirinthPath {
  static List<Character> path = new ArrayList<>();
  static char[][] lab = {
      {' ', ' ', ' ', '*', ' ', ' ', ' '},
      {'*', '*', ' ', '*', ' ', '*', ' '},
      {' ', ' ', ' ', ' ', ' ', ' ', ' '},
      {' ', '*', '*', '*', '*', '*', ' '},
      {' ', ' ', ' ', ' ', ' ', ' ', '?'},
  };
  static int[][] dirs = {
      {0, -1, 'L'}, // left
      {-1, 0, 'U'}, // up
      {1, 0, 'R'},  // right
      {0, 1, 'D'}   // down
  };

  static void findExit(int row, int col, char direction, int steps) {
    if (row < 0 || row >= lab.length ||
        col < 0 || col >= lab[0].length) {
      // We are out of the labyrinth -> can't find a path
      return;
    }

    // Check if we have found the exit
    if (lab[row][col] == '?') {
      System.out.println(String.format("Found the exit in %s steps!", steps));
      path.add(direction);
      printPath();
      path.remove(path.size() - 1);
    }

    if (lab[row][col] != ' ') {
      // The current cell is not free -> can't find a path
      return;
    }

    // Temporary mark the current cell as visited
    lab[row][col] = 's';
    path.add(direction);

    // Invoke recursion to explore all possible directions
    for (int[] dir : dirs) {
      findExit(row + dir[0], col + dir[1], (char)dir[2], steps + 1);
    }

    // Mark back the current cell as free
    lab[row][col] = ' ';
    path.remove(path.size() - 1);
  }
  
  private static void printPath() {
    System.out.println("Path: " + path.toString());
  }
  
  public static void main(String[] args) {
    findExit(0, 0, 'S', 0);
  }
}
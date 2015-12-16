## Data Structures, Algorithms and Complexity
### _Homework_

1. **What is the expected running time of the following Java code?**
  - Explain why using Markdown.
  - Assume the array's size is `n`.

  ```java
  long compute(int[] arr) {
      long count = 0;
      for (int i = 0; i < arr.Length; i++) {
          int start = 0, end = arr.Length-1;
          while (start < end)
              if (arr[start] < arr[end])
                  { start++; count++; }
              else 
                  end--;
      }
      return count;
  }
  ```

2. **What is the expected running time of the following Java code?**
  - Explain why using Markdown.
  - Assume the input matrix has size of `n * m`.

  ```java
  long calcCount(int[][] matrix) {
      long count = 0;
      for (int row = 0; row < matrix.length; row++)
          if (matrix[row][0] % 2 == 0)
              for (int col = 0; col < matrix[0].length; col++)
                  if (matrix[row][col] > 0)
                      count++;
      return count;
  }
  ```

3. **(*) What is the expected running time of the following Java code?**
  - Explain why using Markdown.
  - Assume the input matrix has size of `n * m`.

  ```java
  long calcSum(int[][] matrix, int row) {
      long sum = 0;
      for (int col = 0; col < matrix[0].length; col++) 
          sum += matrix[row][col];
      if (row + 1 < matrix.length) 
          sum += calcSum(matrix, row + 1);
      return sum;
  }
  
  System.out.println(calcSum(matrix, 0));
  ```

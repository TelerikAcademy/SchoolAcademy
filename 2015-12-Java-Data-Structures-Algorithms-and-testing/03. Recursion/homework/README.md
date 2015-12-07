## Recursion
### _Homework_

1. Write a recursive program that simulates the execution of `n nested loops `from 1 to n.
  * _Examples_:
  ```
           1 1
  n=2  ->  1 2
           2 1
           2 2
  
           1 1 1
           1 1 2
           1 1 3
           1 2 1
  n=3  ->  ...
           3 2 3
           3 3 1
           3 3 2
           3 3 3
  ```
2. Write a recursive program for generating and printing all the `combinations with duplicates `of k elements from n-element set. Example:
  * `n=3, k=2` &rarr; `(1 1), (1 2), (1 3), (2 2), (2 3), (3 3)`
3. Modify the previous program to `skip duplicates`:
  * `n=4, k=2` &rarr; `(1 2), (1 3), (1 4), (2 3), (2 4), (3 4)`
4. Write a recursive program for generating and printing all `permutations` of the numbers 1, 2, ..., n for given integer number n. Example:
  * `n=3` &rarr; `{1, 2, 3}, {1, 3, 2}, {2, 1, 3},					{2, 3, 1}, {3, 1, 2},{3, 2, 1}`
5. Write a recursive program for generating and printing all ordered k-element subsets from n-element set (`variations V`<sup>`k`</sup><sub>`n`</sub>`)`.
  * _Example_: `n=3, k=2, set = {hi, a, b}` &rarr; `(hi hi), (hi a), (hi b), (a hi), (a a), (a b), (b hi), (b a), (b b)`
6. Write a program for generating and printing `all subsets of k strings` from given set of strings.
  * _Example_: `s = {test, rock, fun}, k=2` &rarr; `(test rock),  (test fun),  (rock fun)`
7. We are given a matrix of passable and non-passable cells.
  * Write a recursive program for finding all paths between two cells in the matrix.
8. Modify the above program to check whether a path exists between two cells without finding all possible paths.
  * Test it over an empty `100 x 100` matrix.
9. Write a recursive program to find the largest connected area of adjacent empty cells in a matrix.
10. *We are given a matrix of passable and non-passable cells.
  * Write a recursive program for finding all areas of passable cells in the matrix.
11. *Write a program to generate all `permutations with repetitions `of given multi-set.
  * _Example_: the multi-set `{1, 3, 5, 5}` has the following 12 unique permutations:
  ```
    { 1, 3, 5, 5 }	{ 1, 5, 3, 5 }
    { 1, 5, 5, 3 }	{ 3, 1, 5, 5 }
    { 3, 5, 1, 5 }	{ 3, 5, 5, 1 }
    { 5, 1, 3, 5 }	{ 5, 1, 5, 3 }
    { 5, 3, 1, 5 }	{ 5, 3, 5, 1 }
    { 5, 5, 1, 3 }	{ 5, 5, 3, 1 }
  ```
  * Ensure your program efficiently avoids duplicated permutations.
  * Test it with `{ 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 }`.
  * Hint: [Permutations with repetition](http://hardprogrammer.blogspot.com/2006/11/permutaciones-con-repeticin.html)
12. *Write a recursive program to solve the "8 Queens Puzzle" with backtracking.
  * Learn more at: [wiki/Eight queens puzzle](http://en.wikipedia.org/wiki/Eight_queens_puzzle)
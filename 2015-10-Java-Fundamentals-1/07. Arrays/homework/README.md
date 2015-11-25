## Arrays
### Homework
### _WARNING_: This homework is a copy of the [C# - Part 2](https://github.com/TelerikAcademy/CSharp-Part-2) course and some of the problems might not be solvable with the material form this lecture or the names of the classes and packages/namespaces differ!

### Problem 1. Allocate array
*	Write a program that allocates array of `20` integers and initializes each element by its index multiplied by `5`.
*	Print the obtained array on the console.

### Problem 2. Compare arrays
*	Write a program that reads two `integer` arrays from the console and compares them element by element.

### Problem 3. Compare char arrays
*	Write a program that compares two `char` arrays lexicographically (letter by letter).

### Problem 4. Maximal sequence 
*	Write a program that finds the **maximal sequence** of equal elements in an array.

_Example:_

|              input              | result  |
|---------------------------------|---------|
| 2, 1, 1, 2, 3, 3, **2, 2, 2**, 1 | 2, 2, 2 |

### Problem 5. Maximal increasing sequence
*	Write a program that finds the maximal increasing sequence in an array.

_Example:_

|          input          | result  |
|-------------------------|---------|
| 3, **2, 3, 4**, 2, 2, 4 | 2, 3, 4 |

### Problem 6. Maximal K sum
*	Write a program that reads two integer numbers `N` and `K` and an array of `N` elements from the console.
*	Find in the array those `K` elements that have maximal sum.

### Problem 7. Selection sort
*	**Sorting** an array means to arrange its elements in increasing order. Write a program to sort an array.
*	Use the [Selection sort](http://en.wikipedia.org/wiki/Selection_sort) algorithm: Find the smallest element, move it at the first position, find the smallest from the rest, move it at the second position, etc.

### Problem 8. Maximal sum
*	Write a program that finds the sequence of maximal sum in given array.

_Example:_

|                 input               |    result   |
|-------------------------------------|-------------|
| 2, 3, -6, -1, **2, -1, 6, 4**, -8, 8 | 2, -1, 6, 4 |

*	_Can you do it with only one loop (with single scan through the elements of the array)?_

### Problem 9. Frequent number
*	Write a program that finds the most frequent number in an array.

_Example:_

|                  input                |    result   |
|---------------------------------------|-------------|
| **4**, 1, 1, **4**, 2, 3, **4**, **4**, 1, 2, **4**, 9, 3 | 4 (5 times) |

### Problem 10. Find sum in array
*	Write a program that finds in given array of integers a sequence of given sum `S` (if present).

_Example:_

|        array        |  S |  result |
|---------------------|----|---------|
| 4, 3, 1, **4, 2, 5**, 8 | 11 | 4, 2, 5 |

### Problem 11. Binary search
*	Write a program that finds the index of given element in a sorted array of integers by using the [Binary search](http://en.wikipedia.org/wiki/Binary_search_algorithm) algorithm.

### Problem 12. Index of letters
*	Write a program that creates an array containing all letters from the alphabet (`A-Z`).
*	Read a word from the console and print the index of each of its letters in the array.

### Problem 13.*  Merge sort
*	Write a program that sorts an array of integers using the [Merge sort](http://en.wikipedia.org/wiki/Merge_sort) algorithm.

### Problem 14. Quick sort
*	Write a program that sorts an array of integers using the [Quick sort](http://en.wikipedia.org/wiki/Quicksort) algorithm.

### Problem 15. Prime numbers
*	Write a program that finds all prime numbers in the range [`1...10 000 000`]. Use the [Sieve of Eratosthenes](http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes) algorithm.

### Problem 16.* Subset with sum S
*	We are given an array of integers and a number `S`.
*	Write a program to find if there exists a subset of the elements of the array that has a sum `S`.

_Example:_

|       input array      | S  |     result    |
|:----------------------:|:--:|:-------------:|
| 2, **1**, **2**, 4, 3, **5**, 2, **6** | 14 | yes |

### Problem 17.* Subset K with sum S
*	Write a program that reads three integer numbers `N`, `K` and `S` and an array of `N` elements from the console.
*	Find in the array a subset of `K` elements that have sum `S` or indicate about its absence.

### Problem 18.* Remove elements from array
*	Write a program that reads an array of integers and removes from it a minimal number of elements in such a way that the remaining array is sorted in increasing order.
*	Print the remaining sorted array.

_Example:_

|           input           |     result    |
|:-------------------------:|:-------------:|
| 6, **1**, 4, **3**, 0, **3**, 6, **4**, **5** | 1, 3, 3, 4, 5 |

### Problem 19.* Permutations of set
*	Write a program that reads a number `N` and generates and prints all the permutations of the numbers [`1 … N`].

_Example:_

| N |                                  result                                 |
|:-:|:-----------------------------------------------------------------------:|
| 3 | `{1, 2, 3}` <br> `{1, 3, 2}` <br> `{2, 1, 3}` <br> `{2, 3, 1}` <br> `{3, 1, 2}` <br> `{3, 2, 1}` |

### Problem 20.* Variations of set
*	Write a program that reads two numbers `N` and `K` and generates all the variations of `K` elements from the set [`1..N`].

_Example:_

| N | K |                                      result                                      |
|:-:|:-:|:--------------------------------------------------------------------------------:|
| 3 | 2 | `{1, 1}` <br> `{1, 2}` <br> `{1, 3}` <br> `{2, 1}` <br> `{2, 2}` <br> `{2, 3}` <br> `{3, 1}` <br> `{3, 2}` <br> `{3, 3}` |

### Problem 21.* Combinations of set
*	Write a program that reads two numbers `N` and `K` and generates all the combinations of `K` distinct elements from the set [`1..N`].

_Example:_

| N | K |                                          result                                           |
|:-:|:-:|:-----------------------------------------------------------------------------------------:|
| 5 | 2 | `{1, 2}` <br> `{1, 3}` <br> `{1, 4}` <br> `{1, 5}` <br> `{2, 3}` <br> `{2, 4}` <br> `{2, 5}` <br> `{3, 4}` <br> `{3, 5}` <br> `{4, 5}` |

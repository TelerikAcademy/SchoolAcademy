## Loops
### Homework
### _WARNING_: This homework is a copy of the [C# - Part 1](https://github.com/TelerikAcademy/CSharp-Part-1) course and some of the problems might not be solvable with the material form this lecture or the names of the classes and packages/namespaces differ!

### Problem 1.	Numbers from 1 to N
*	Write a program that enters from the console a positive integer `n` and prints all the numbers from `1` to `n`, on a single line, separated by a space.

_Examples:_

| n            | output    | 
|--------------|-----------|
| 3            | 1 2 3     | 
| 5            | 1 2 3 4 5 |

### Problem 2.	Numbers Not Divisible by 3 and 7
*	Write a program that enters from the console a positive integer `n` and prints all the numbers from `1` to `n` not divisible by `3` or `7`, on a single line, separated by a space.

_Examples:_

| n  | output       |
|----|--------------|
| 3  | 1 2          |
| 10 | 1 2 4 5 8 10 |

### Problem 3.	Min, Max, Sum and Average of N Numbers
*	Write a program that reads from the console a sequence of `n` integer numbers and returns the minimal, the maximal number, the sum and the average of all numbers (displayed with 2 digits after the decimal point).
*	The input starts by the number `n` (alone in a line) followed by `n` lines, each holding an integer number.
*	The output is like in the examples below.

_Example 1:_

| input | output     |
|-------|------------|
| 3 <br> 2 <br> 5 <br> 1 | min = 1 <br> max = 5 <br> sum = 8 <br> avg = 2.67 |

_Example 2:_

| input | output     |
|-------|------------|
| 2 <br> -1 <br> 4 | min = -1 <br> max = 4 <br> sum = 3 <br> avg = 1.50 |


### Problem 4.	Print a Deck of 52 Cards
*	Write a program that generates and prints all possible cards from a [standard deck of 52 cards](http://en.wikipedia.org/wiki/Standard_52-card_deck) (without the jokers).
	The cards should be printed using the classical notation (like 5 of spades, A of hearts, 9 of clubs; and K of diamonds).
	*	The card faces should start from 2 to A.
	*	Print each card face in its four possible suits: clubs, diamonds, hearts and spades.
	Use 2 nested for-loops and a switch-case statement.
	
_output_

	2 of spades, 2 of clubs, 2 of hearts, 2 of diamonds
	3 of spades, 3 of clubs, 3 of hearts, 3 of diamonds
	…  
	K of spades, K of clubs, K of hearts, K of diamonds
	A of spades, A of clubs, A of hearts, A of diamonds

_Note: You may use the suit symbols instead of text._

### Problem 5.	Calculate 1 + 1!/X + 2!/X^2 + … + N!/X^N
*	Write a program that, for a given two integer numbers `n` and `x`, calculates the sum `S = 1 + 1!/x + 2!/x2 + … + n!/x^n`.
*	Use only one loop. Print the result with `5` digits after the decimal point.

_Examples:_

| n           | x          | S       |
|-------------|------------|---------|
| 3           | 2          | 2.75000 |
| 4           | 3          | 2.07407 |
| 5           | -4         | 0.75781 |

### Problem 6.	Calculate N! / K!
*	Write a program that calculates `n! / k!` for given `n` and `k` (1 < k < n < 100).
*	Use only one loop.

_Examples:_

| n           | k          | n! / k! |
|-------------|------------|---------|
| 5           | 2          | 60      |
| 6           | 5          | 6       |
| 8           | 3          | 6720    |

### Problem 7.	Calculate N! / (K! * (N-K)!)
*	In combinatorics, the number of ways to choose `k` different members out of a group of `n` different elements (also known as the number of combinations) is calculated by the following formula:
![formula](https://cloud.githubusercontent.com/assets/3619393/5626060/89cc780e-958e-11e4-88d2-0e1ff7229768.png)
For example, there are 2598960 ways to withdraw 5 cards out of a standard deck of 52 cards.
*	Your task is to write a program that calculates `n! / (k! * (n-k)!)` for given `n` and `k` (1 < k < n < 100). Try to use only two loops.

_Examples:_

| n           | k | n! / (k! * (n-k)!) |
|-------------|---|--------------------|
| 3           | 2 | 3                  |
| 4           | 2 | 6                  |
| 10          | 6 | 210                |
| 52          | 5 | 2598960            |

### Problem 8.	Catalan Numbers
*	In combinatorics, the Catalan numbers are calculated by the following formula:
![catalan-formula](https://cloud.githubusercontent.com/assets/3619393/5626137/d7ec8bc2-958f-11e4-9787-f6c386847c81.png)
*	Write a program to calculate the `n`<sup>`th`</sup> Catalan number by given `n` (0 &#8804; n &#8804; 100). 

_Examples:_

| n           | Catalan(n) |
|-------------|------------|
| 0           | 1          |
| 5           | 42         |
| 10          | 16796      |
| 15          | 9694845    |

### Problem 9.	Matrix of Numbers
*	Write a program that reads from the console a positive integer number `n` (1 &#8804; n &#8804; 20) and prints a matrix like in the examples below. Use two nested loops.

_Examples:_

	n = 2	matrix		n = 3	matrix		n = 4	matrix
			1 2					1 2 3				1 2 3 4
			2 3					2 3 4				2 3 4 5
								3 4 5				3 4 5 6
													4 5 6 7

### Problem 10.	Odd and Even Product
*	You are given `n` integers (given in a single line, separated by a space).
*	Write a program that checks whether the product of the odd elements is equal to the product of the even elements.
*	Elements are counted from `1` to `n`, so the first element is odd, the second is even, etc.

_Examples:_

| numbers           | result |
|-------------------|--------|
| 2 1 1 6 3         | yes    |
| product = 6       |        |
|                   |        |
| 3 10 4 6 5 1      | yes    |
| product = 60      |        |
|                   |        |
| 4 3 2 5 2         | no     |
| odd_product = 16  |        |
| even_product = 15 |        |

### Problem 11.	Random Numbers in Given Range
*	Write a program that enters `3` integers `n`, `min` and `max` (`min != max`) and prints `n` random numbers in the range `[min...max]`.

_Examples:_

| n                 | min | max     |         random numbers        |
|-------------------|-----|---------|-------------------------------|
| 5                 | 0   | 1       | 1 0 0 1 1                     |
| 10                | 10  | 15      | 12 14 12 15 10 12 14 13 13 11 |

_Note: The above output is just an example. Due to randomness, your program most probably will produce different results._

### Problem 12.* Randomize the Numbers 1…N
*	Write a program that enters in integer `n` and prints the numbers `1, 2, …, n` in random order.

_Examples:_

| n                 | randomized numbers 1…n |
|-------------------|------------------------|
| 3                 | 2 1 3                  |
| 10                | 3 4 8 2 6 7 9 1 10 5   |

_Note: The above output is just an example. Due to randomness, your program most probably will produce different results. You might need to use arrays._

### Problem 13.	Binary to Decimal Number
*	Using loops write a program that converts a binary integer number to its decimal form.
*	The input is entered as string. The output should be a variable of type long.
*	Do not use the built-in functionality.

_Examples:_

| binary                       | decimal   |
|------------------------------|-----------|
| 0                            | 0         |
| 11                           | 3         |
| 1010101010101011             | 43691     |
| 1110000110000101100101000000 | 236476736 |

### Problem 14.	Decimal to Binary Number
*	Using loops write a program that converts an integer number to its binary representation.
*	The input is entered as long. The output should be a variable of type string.
*	Do not use the built-in functionality.

_Examples:_

| decimal           | binary                       |
|-------------------|------------------------------|
| 0                 | 0                            |
| 3                 | 11                           |
| 43691             | 1010101010101011             |
| 236476736         | 1110000110000101100101000000 |

### Problem 15.	Hexadecimal to Decimal Number
*	Using loops write a program that converts a hexadecimal integer number to its decimal form.
*	The input is entered as string. The output should be a variable of type long.
*	Do not use the built-in functionality.

_Examples:_

| hexadecimal       | decimal                      |
|-------------------|------------------------------|
| FE                | 254                          |
| 1AE3              | 6883                         |
| 4ED528CBB4        | 338583669684                 |

### Problem 16.	Decimal to Hexadecimal Number
*	Using loops write a program that converts an integer number to its hexadecimal representation.
*	The input is entered as long. The output should be a variable of type string.
*	Do not use the built-in functionality.

_Examples:_

| decimal      | hexadecimal |
|--------------|-------------|
| 254          | FE          |
| 6883         | 1AE3        |
| 338583669684 | 4ED528CBB4  |

### Problem 17.* Calculate GCD
*	Write a program that calculates the greatest common divisor (GCD) of given two integers `a` and `b`.
*	Use the Euclidean algorithm (find it in Internet).

_Examples:_

| a  | b   | GCD(a, b) |
|----|-----|-----------|
| 3  | 2   | 1         |
| 60 | 40  | 20        |
| 5  | -15 | 5         |

### Problem 18.* Trailing Zeroes in N!
*	Write a program that calculates with how many zeroes the factorial of a given number `n` has at its end.
*	Your program should work well for very big numbers, e.g. `n=100000`.

_Examples:_

| n      | trailing zeroes of n! | explaination        |
|--------|-----------------------|---------------------|
| 10     | 2                     | 3628800             |
| 20     | 4                     | 2432902008176640000 |
| 100000 | 24999                 | think why           |

### Problem 19.** Spiral Matrix
*	Write a program that reads from the console a positive integer number `n` (1 &#8804; n &#8804; 20) and prints a matrix holding the numbers from `1` to `n*n` in the form of square spiral like in the examples below.

_Examples:_

	n = 2	matrix		n = 3	matrix		n = 4	matrix
			1 2					1 2 3				1  2  3  4
			4 3					8 9 4				12 13 14 5
								7 6 5				11 16 15 6
													10 9  8  7

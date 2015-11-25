## Using Classes and Objects
### Homework
### _WARNING_: This homework is a copy of the [C# - Part 2](https://github.com/TelerikAcademy/CSharp-Part-2) course and some of the problems might not be solvable with the material form this lecture or the names of the classes and packages/namespaces differ!

#### Problem 1. Leap year
*	Write a program that reads a year from the console and checks whether it is a leap one.
*	Use `System.DateTime`.

#### Problem 2. Random numbers
*	Write a program that generates and prints to the console `10` random values in the range [`100, 200`].

#### Problem 3. Day of week
*	Write a program that prints to the console which day of the week is today.
*	Use `System.DateTime`.

#### Problem 4. Triangle surface
*	Write methods that calculate the surface of a triangle by given:
	*	Side and an altitude to it;
	*	Three sides;
	*	Two sides and an angle between them;
*	Use `System.Math`.
	
_Example:_

|      input               | output  |
|--------------------------|:-------:|
| * a = 23.2, h = 5        |  58     |
| * a = 11, b =12, c = 13  |  61.48  |
| * a = 10, b = 7, C = 25° |  14.79  |

#### Problem 5. Workdays
*	Write a method that calculates the number of workdays between today and given date, passed as parameter.
*	Consider that workdays are all days from Monday to Friday except a fixed list of public holidays specified preliminary as array.

#### Problem 6. Sum integers
*	You are given a sequence of positive integer values written into a string, separated by spaces.
*	Write a function that reads these values from given string and calculates their sum.

_Example:_

|      input       | output |
|------------------|:------:|
| "43 68 9 23 318" | 461    |

#### Problem 7.* Arithmetical expressions
*	Write a program that calculates the value of given arithmetical expression.
*	The expression can contain the following elements only:
	*	Real numbers, e.g. `5`, `18.33`, `3.14159`, `12.6`
	*	Arithmetic operators: `+`, `-`, `*`, `/` (standard priorities)
	*	Mathematical functions: `ln(x)`, `sqrt(x)`, `pow(x,y)`
	*	Brackets (for changing the default priorities): `(`, `)`

_Examples:_

|                        input                       | output |
|----------------------------------------------------|--------|
| (3+5.3) * 2.7 - ln(22) / pow(2.2, -1.7)            | ~10.6  |
| pow(2, 3.14) * (3 - (3 * sqrt(2) - 3.2) + 1.5*0.3) | ~21.22 |

_Hint: Use the classical [Shunting-yard algorithm](http://en.wikipedia.org/wiki/Shunting-yard_algorithm) and [Reverse Polish notation](http://en.wikipedia.org/wiki/Reverse_Polish_notation)._

<!-- section start -->

<!-- attr: {id: 'title', class: 'slide-title', hasScriptWrapper: true} -->

# Loops
##  Repeat code over and over again

<div class="signature">
    <p class="signature-course">Java Fundamentals - Part 1</p>
    <p class="signature-initiative">Telerik School Academy</p>
    <a href="http://academy.telerik.com" class="signature-link">http://academy.telerik.com</a>
</div>

<!-- section start -->
<!-- attr: {id: 'table-of-contents'} -->
# Table of Contents

*   What is a Loop?
*   Loops in C#
    *   `while` loops
    *   `do-while` loops
    *   `for` loops
    *   `for-in` loops
*   Special loop operators
    *   `break`, `continue`, `goto`
*   Nested loops

<!-- section start -->
<!-- attr: {id: 'what-is-a-loop', class: 'slide-title'} -->
#   What is a Loop?
##    Repeat code

# What is a Loop?

*   A **loop** is a control statement that allows **repeating execution** of a block of statements
    *   May execute a code block **fixed number of times**
    *   May execute a code block **while given condition holds**
    *   May execute a code block **for each member of a collection**
*   Loops that never end are called an **infinite loops**

<!-- section start -->

#   Using `while` Loop
##    Repeating a Statement While Given Condition Holds

#   How To Use While Loop?

*   The simplest and most frequently used loop

```java
while (condition) {
    statements;
}
```
*   The repeat condition
    *   Returns a boolean result of `true` or `false`
    *   Also called loop condition

#   While Loop – How It Works?

*   The block schema of a while loop:

<img src="imgs/example-while-block-schema.png" />


#   While Loop – Example

*   _Example:_ Printing the numbers from 0 to 9:

```java
int counter = 0;
while (counter < 10) {
    Console.WriteLine("Number : {0}", counter);
    ++counter;
}
```

#   The `while` Loop
##  Examples

#   Sum 1..N – Example

*   _Example:_ Calculate and print the sum of the **first N natural numbers**

```java
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int number = 1;
int sum = 1;

System.out.print("The sum 1");
while (number < n) {
   ++number;
   sum += number;
   System.out.print("+" + number);
}
System.out.println(" = " + sum);
```

#   Calculating Sum 1..N
##  [Demo](http://)


#   Prime Number – Example

*   _Example:_ Checking whether a number is prime or not:

```java
System.out.println("Enter a positive integer number: ");
Scanner scanner = new Scanner(System.in);

String consoleArgument = scanner.next();
int number = Integer.parseInt(consoleArgument);

int divider = 2;
int maxDivider = (int) Math.sqrt(number);
bool prime = true;
while (prime && (divider <= maxDivider)) {
    if (number % divider == 0) {
        prime = false;
    }
    divider++;
}
System.out.println(number + "is " + (prime?"":" not") + " prime");
```

#   Checking Whether a Number Is Prime
##  [Demo](http://)

#   Loop operators
#   `break`, `continue`, `goto`

#   Using break Operator

*   The `break` operator exits the **inner-most loop**
*   _Example:_ Calculate `N! = 1*2*3*....*(N-1)*N`

```java
int n = scanner.nextInt();

int result = 1;
while (true) {
    if (n == 1) {
        break;
    }

    result *= n;
    --n;
}
System.out.println("n! = " + result);
```

#   Calculating Factorial
##  [Demo](http://)

<!-- section start -->

#   The `do-while` Loop
##  Almost the same as `while`

#   Using do-while Loop

*   Another loop structure is:

```java
do {
    statements;
} while (condition);

```

*   The block of statements is repeated
    *   While the boolean loop condition holds
*   The loop is executed at least once

#   do-while Loop - How does it works?

*   The block schema of a do-while loop:

<img src="imgs/example-do-while-block-schema.png" />

#   The `do-while` loop
##  Examples

#   N Factorial – Example

*   _Example:_ Calculating N factorial (N!)

```java
String numberAsString = scanner.next();
int n = Integer.parseInt(numberAsString);
int factorial = 1;

do {
  factorial *= n;
  --n;
} while (n > 0);

System.out.println("n! = " + factorial);
```

#   Calculating N! with do-while
##  [Demo](http://)

#   Product[N..M] – Example

*   Calculating the product of all numbers in the interval [n..m]:

```java
int n = Integer.parseInt(scanner.next());
int m = Integer.parseInt(scanner.next());
int number = n;
double product = 1;

do {
    product *= number;
    ++number;
} while (number <= m);

System.out.println("product[n..m] = " + product);
```

#   Product of the Numbers in the Interval [n..m]
##  [Demo](http://)

<!-- attr: {id: ''} -->
#

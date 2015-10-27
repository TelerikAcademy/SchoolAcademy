<!-- section start -->

<!-- attr: {id: 'title', class: 'slide-title', hasScriptWrapper: true} -->

# Methods in Java
##  Named pieces of code

<div class="signature">
    <p class="signature-course">Java Fundamentals - Part 1</p>
    <p class="signature-initiative">Telerik School Academy</p>
    <a href="http://academy.telerik.com" class="signature-link">http://academy.telerik.com</a>
</div>

<!-- section start -->

<!-- attr: {id: 'table-of-contents'} -->
# Table of Contents

*   Using Methods
    *   What is a Method? Why to Use Methods?
    *   Declaring and Creating Methods
    *   Calling Methods
*   Methods with Parameters
    *   Passing Parameters
    *   Returning Values
*   Best Practices

<!-- section start -->

#   Using Methods
##  Methods 101

#   Using Methods

*   A method is a kind of **building block** that solves a **small problem**
    *   A piece of code that **has a name** and can be **called from the other code**
    *   Can take **parameters** and **return a value**
*   Methods allow programmers to construct large programs from simple pieces
*   Methods are also known as **functions**, **procedures**, and **subroutines**

#   Why to use Methods?

*   More manageable programming
    *   Split large problems into small pieces
    *   Better organization of the program
    *   Improve code readability
    *   Improve code understandability
*   Avoiding repeating code
    *   Improve code maintainability
*   Code reusability
    *   Using existing methods several times

#   Declaring and Creating Methods
##  How and Why

#   Declaring and Creating Methods

*   A basic method to print text:

```java
static void printLogo() {
    System.out.println("Telerik Academy");
    System.out.println("http://academy.telerik.com");
}
```

*   Methods declared `static` can be called by any other method (static or not)
    *   This will be discussed during OOP in details
*   The keyword `void` means that the method does not return any result

#   Declaring and Creating Methods

*   A basic method to print text:

```java
static void printLogo() {
    System.out.println("Telerik Academy");
    System.out.println("http://academy.telerik.com");
}
```

*   Each method has a body
    *   It contains the programming code
    *   Surrounded by `{` and `}`

#   Declaring and Creating Methods

*   Methods are **always** declared **inside a class**
    *   `main()` is also a method like all others

```java
class MethodsDemo {
    static void printLogo() {
        System.out.println("Telerik Academy");
        System.out.println("http://academy.telerik.com");
    }

    public static void main(String[] args) {
        // ...
    }
}
```

<!-- section start -->

#   Invoking Methods
##   i.e. use them

#   Invoking Methods

*   To call a method, simply use:
    *   The method’s name
    *   Parentheses (don’t forget them!)
    *   A semicolon (;)

```java
printLogo();
```

*   This will execute the code in the method’s body and will result in printing the following:

```java
Telerik Academy
http://academy.telerik.com
```

#   Declaring and Invoking Methods
##  [Demo](http://)

<!-- section start -->

#   Methods with Parameters
##  Passing parameters and return values

#   Method Parameters

*   To pass information to a method, you can use parameters (also known as arguments)
    *   You can pass **zero or several** input values
    *   You can pass values of **any type**
    *   Each **parameter** has **name** and **type**
    *   Parameters are assigned to particular values when the method is called
    *   Parameters can change the method behavior depending on the passed values

#   Defining and Using Method Parameters

*   _Example:_ Method for printing the sign of a number:

```java
static void printSign(int number) {
    if (number > 0) {
        System.out.println("Positive");
    }
    else if (number < 0) {
        System.out.println("Negative");
    }
    else {
        System.out.println("Zero");
    }
}
```

*   Method’s behavior depends on its parameters
*   Parameters can be of any type
    *   int, double, string, etc.
    *   Arrays (int[], double[], etc.)

#   Defining and Using Method Parameters

Methods can have as many parameters as needed:

```java
static void printMax(float number1, float number2) {
    float max = number1;
    if (number2 > number1) {
        max = number2;
    }
    System.out.printf("Maximal number: %f", max);
}
```

#   Invoking Methods with Parameters

*   To invoke a method and pass values to its parameters:
    *   Use the **method’s name**, followed by a **list of expressions for each parameter**
*   _Examples:_

```java
printSign(-5);
printSign(balance);
printSign(2 + 3);

printMax(100, 200);
printMax(oldQuantity * 1.5, quantity * 2);
```

#   Calling Methods with Parameters

*   Expressions must be of the same type as method’s parameters (or compatible)
    *   If the method requires a float expression, you can pass int instead
*   Use the same order like in method declaration
*   For methods with no parameters do not forget the parentheses

<!-- section start -->

<!-- attr: { class: 'slide-questions'} -->
# Loops
## Questions

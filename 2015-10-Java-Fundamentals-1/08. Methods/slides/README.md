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
    *   What is a Method? 
    *   Why to Use Methods?
    *   Declaring and Creating Methods
    *   Calling Methods
*   Methods with Parameters
    *   Passing Parameters
    *   Returning Values
*   Best Practices

<!-- section start -->

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Using Methods
##  Methods 101 -->

#   Using Methods

*   A method is a kind of **building block** that solves a **small problem**
    *   A piece of code that **has a name** and can be **called from the other code**
    *   Can take **parameters** and **return a value**
*   Methods allow programmers to construct large programs from simple pieces
*   Methods are also known as **functions**, **procedures**, and **subroutines**

<!-- attr: {showInPresentation: true} -->
<!-- #   Why to use Methods? -->

*   More manageable programming
    *   Split large problems into small pieces
    *   Better organization of the program
    *   Improve code readability
    *   Improve code understandability
*   Avoiding repeating code
    *   Improve code maintainability
*   Code reusability
    *   Using existing methods several times

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Declaring and Creating Methods
##  How and Why -->

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

<!-- attr: {showInPresentation: true} -->
<!-- #   Declaring and Creating Methods

*   A basic method to print text:

```java
static void printLogo() {
    System.out.println("Telerik Academy");
    System.out.println("http://academy.telerik.com");
}
``` -->

*   Each method has a body
    *   It contains the programming code
    *   Surrounded by `{` and `}`

<!-- attr: {showInPresentation: true} -->
<!-- #   Declaring and Creating Methods -->

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

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Invoking Methods
##   i.e. use them -->

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

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Declaring and Invoking Methods -->
##  [Demo](http://)

<!-- section start -->

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Methods with Parameters
##  Passing parameters and return values -->

#   Method with Parameters

*   To pass information to a method, you can use parameters (also known as arguments)
    *   You can pass **zero or several** input values
    *   You can pass values of **any type**
    *   Each **parameter** has **name** and **type**
    *   Parameters are assigned to particular values when the method is called
    *   Parameters can change the method behavior depending on the passed values

<!-- attr: {style: 'font-size:40px', showInPresentation: true} -->
<!-- #   Method with Parameters -->

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

<!-- attr: {showInPresentation: true} -->
<!-- #   Invoking Methods with Parameters -->

*   Expressions must be of the same type as method’s parameters (or compatible)
    *   If the method requires a float expression, you can pass int instead
*   Use the same order like in method declaration
*   For methods with no parameters do not forget the parentheses

<!-- section start -->

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Using Methods With Parameters
##  Examples -->

<!-- attr: {showInPresentation: true} -->
<!-- #   Methods Parameters – Example -->

*   _Example:_ Method that prints the sign of a number

```java
static void printSign(int number) {
  if (number > 0) {
    System.out.println("The number %d is positive.", number);
  }
  else if (number < 0) {
    System.out.println("The number %d is negative.", number);
  }
  else {
    System.out.println("The number %d is zero.", number);
  }
}
```

<!-- attr: {showInPresentation: true} -->
<!-- #   Method parameters - Examples -->

*   _Example:_ Method that prints the max number

```java
static void printMax(float number1, float number2) {
  float max = number1;
  if (number2 > number1) {
    max = number2;
  }
  System.out.println("Maximal number: %f", max);
}
```
<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Methods with Parameters -->
##  [Demo](http://)

<!-- attr: {showInPresentation: true} -->
<!-- #   Methods with Parameters - Examples -->

*   Display the period between two months in a user-friendly way

```java
static void SayMonth(int month) {
  string[] monthNames = new string[] {
    "January", "February", "March",
    "April", "May", "June", "July",
    "August", "September", "October",
    "November", "December"};
  System.out.print(monthNames[month-1]);
}
static void SayPeriod(int startMonth, int endMonth) {
  int period = endMonth - startMonth;
  if (period < 0) {
    period = period + 12;
  }
  System.out.print("There are %d + months from ", period);
  SayMonth(startMonth);
  System.out.print(" to ");
  SayMonth(endMonth);
}
```

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Period Between Months - Example -->
##  [Demo](http://)

<!-- attr: {showInPresentation: true} -->
<!-- #   Printing Triangle – Example -->

*   _Example:_ Creating a program for printing triangles as shown below:
    *   n = 5
```java
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```

<!-- attr: {showInPresentation: true, showInPresentation: true} -->
<!-- #   Printing Triangle - The Code -->
*   The code:

```java
static void printTriangle(int n) {
    for (int line = 1; line <= n; line++) {
        PrintLine(1, line);
    }
    for (int line = n-1; line >= 1; line--) {
        PrintLine(1, line);
    }
}

static void printLine(int start, int end)
{
    for (int i = start; i <= end; i++)
    {
        System.out.printf(" %d", i);
    }
    System.out.println();
}
```

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Printing triangles -->
##  [Demo](http://)

<!-- section start -->

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Returning Values From Methods
##  Do its work, then return result -->

#   Returning Values From Methods

*   A method can return a value to its invoker
*   The Returned value:
    *   Can be assigned to a variable:

    ```java
    String message = scanner.next();
    ```

    *   Can be used in expressions:

    ```java
    float price = getPrice() * quantity * 1.20;
    ```

    *   Can be passed to another method:
    ```java
    int age = Integer.parseInt(reader.readLine());
    ```

<!-- attr: {style: 'font-size:40px', showInPresentation: true} -->
<!-- #   Methods Returning a Value -->

*   Instead of void, specify the type of data to return

static int multiply(int firstNum, int secondNum) {
    return firstNum * secondNum;
}

*   Methods can return any type of data (`int`, `string`, `array`, etc.)
*   `void` methods do not return anything
*   The combination of **method's name** and **parameters** is called **method signature**
*   Use the `return` keyword to return a result

#   The return Statement

*   The return statement:
    *   Immediately terminates method’s execution
    *   Returns specified expression to the caller
*   Example:

    ```java
    return -1;
    ```

*   To terminate void method, use just:

    ```java
    return
    ```

*   Return can be used several times in a method body

<!-- section start -->

<!-- attr: {class: 'slide-section'} -->
#   Returning Values From Methods
##  Examples

<!-- attr: {showInPresentation: true} -->
<!-- #   Temperature Conversion – Example -->

*   Convert temperature from Fahrenheit to Celsius:

```java
static double fahrenheitToCelsius(double degrees) {
  double celsius = (degrees - 32) * 5 / 9;
  return celsius;
}
```

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Temperature Conversion -->
##  [Demo](http://)

<!-- attr: {showInPresentation: true} -->
<!-- #   Positive Numbers – Example -->

*   Check if all numbers in a sequence are positive:

```java
static bool arePositive(int[] sequence) {
    for (int number : sequence) {
        if (number <= 0) {
            return false;
        }
    }
    return true;
}
```

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Positive numbers -->
##  [Demo](http://)

<!-- attr: {showInPresentation: true} -->
<!-- #   Data Validation – Example -->

*   Validating input data

```java
statuc bool validateTime(int hours, int minutes, int seconds){
  return validateHours(hours) && validateMinutes(minutes) && validateSeconds(seconds);
}

static bool validateMinutes(int minutes) {
  bool result = (minutes>=0) && (minutes<=59);
  return result;
}

static bool validateHours(int hours) { ... }
```

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Valiation -->
##  [Demo](http://)

<!-- section start -->

<!-- attr: {showInPresentation: true} -->
<!-- #   Method Overloading
##  Multiple Methods with the Same Name -->

*   What means "to overload a method name"?
    *   Use the same method name for multiple methods with different signature (parameters)
*   _Example:__ with build-in methods

```java
System.out.println(5); //used with int
System.out.println("John Doe"); //used with string
System.out.println(true); //used with Boolean
```

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Built-in method overloading -->
##  [Demo](http://)

<!-- attr: {style: 'font-size: 40px'} -->
#   Defining Method Overloading

*   Just define multiple methods with the **same name**, but different **number**, **order** and/or **type** of parameters

*   _Example:_

```java
static int getRandom(int max){
}
static int getRandom(int min, int max){
}
```

*   Usage:

```java
getRandom(5, 10);
//  returns a number among 5, 6, 7, 8, 9, 10
getRandom(10);
//  returns number among 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
```

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Method Overloading
##  [Demo](http://) -->

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Varying Number of Method Parameters
##  Passing parameters separated with comma -->

#   Varying Method Parameters

*   Java has the so caled `varargs`
    *   i.e. an array of values can be passed using commas

*   _Example:_ Find the maximum among elements:

```java
static int getMax(int... numbers){
  int max = Integer.MIN_VALUE;
  for(int number:numbers)
    if ( max < number)
      max = number;
  return max;
}
//...
int max = getMax(1, 2, 3, 4);
int max2 = getMax(numbersArray);
```

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Varying Number of Method Parameters -->
##  [Demo](http://)

<!-- attr: { class: 'slide-questions', showInPresentation: true} -->
<!-- # Methods in Java -->
## Questions

<!-- section start -->

<!-- attr: {id: 'title', class: 'slide-title', hasScriptWrapper: true} -->

# Operators and Expressions
##  Bitwise, comparison, arithmetic, etc...  
<div class="signature">
    <p class="signature-course">Java Fundamentals</p>
    <p class="signature-initiative">Telerik School Academy</p>
    <a href="http://academy.telerik.com" class="signature-link">http://academy.telerik.com</a>
</div>

<!-- section start -->
<!-- attr: {id: 'table-of-contents'} -->
# Table of Contents

*   Operators in C# and Operator Precedence
*   Arithmetic Operators
*   Logical Operators
*   Bitwise Operators
*   Comparison Operators
*   Assignment Operators
*   Other Operators
*   Implicit and Explicit Type Conversions
*   Expressions

<!-- section start -->

<!-- attr: {id: 'operators', class: 'slide-title', showInPresentation: true} -->
<!-- #   Operators in Java
##    Arithmetic, Logical, Comparison, Assignment, Etc. -->

#   What is an Operator?

*   **Operator** is an **operation performed over data** at runtime
    *   Takes one or more arguments (operands)
    *   Produces a new value
*   Operators have **precedence**
    *   Precedence defines which will be evaluated first
*   **Expressions** are sequences of operators and operands that are evaluated to a single value

#   Operators in Java

*   Operators in Java :
    *   **Unary** – take one operand
    *   **Binary** – take two operands
    *   **Ternary** (?:) – takes three operands
*   Except for the assignment operators, all binary operators are left-associative
*   The assignment operators and the conditional operator (?:) are right-associative

#   Categories of Operators in Java

| Category             | Operators                         |
| -------------------- | --------------------------------- |
| Arithmetic           |+ - * /  %  ++  --                 |
| Logical              | && II ^ !                         |
| Binary               | & I ^ ~ << >>                     |
| Comparison           | == != < > <= >=                   |
| Assignment           | = += -= *= /= %= &= I= ^= <<= >>= |
| String Concatenation | +                                 |
| Type Conversion      | is as typeof                      |
| Other                | . [] () ?: new                    |

<!-- attr: {class: "slide-section", showInPresentation: true} -->
<!-- #   Operator Precedence
##    Which operators are applied first? -->

#   Operator Precedence

| Precedence | Operators                         |
| ---------- | --------------------------------- |
| Highest    | ()                                |
|            | ++ -- (postfix) new typeof        |
|            | ++ -- (prefix) + - (unary) ! ~    |
|            | * / %                             |
|            | + -                               |
|            | << >>                             |
|            | < > <= >= is as                   |
|            | == !=                             |
|            | &                                 |
|            | ^                                 |
|            | I                                 |
|            | &&                                |
|            | II                                |
|            | ?:                                |
| Lowest     | = *= /= %= += -= <<= >>= &= ^= I= |

*   **Parenthesis operator** always has highest precedence
*   Note: prefer using parentheses, even when it seems stupid to do so

<!-- section start -->

<!-- attr: {class: 'slide-section', id: 'arithmetic-operators', showInPresentation: true} -->
<!-- #   Arithmetic Operators
##    Like in Math -->

#   Arithmetic Operators
*   Arithmetic operators `+`, `-`, `*` are the same as in math
*   Division operator `/` if used on integers returns integer (without rounding) or exception
*   Division operator `/` if used on real numbers returns real number or Infinity or NaN
*   Remainder operator `%` returns the remainder from division of integers
*   The special addition operator `++` increments a variable

<!-- attr: { hasScriptWrapper: true} -->
#   Arithmetic Operators - Examples

*  _Example:_ Perimeter and area of a square

```java
int squarePerimeter = 17;
double squareSide = squarePerimeter / 4.0;
double squareArea = squareSide * squareSide;

System.out.println(squareSide); //prints 4.25

System.out.println(squareArea); // prints 18.0625
```

<!-- attr: { hasScriptWrapper: true, showInPresentation: true} -->
<!-- #   Arithmetic Operators - Examples -->
*   _Example:_ Arithmetic operators with integer numbers

```java
int a = 5;
int b = 4;
System.out.println(a + b); //prints 9
System.out.println(a + b++); //prints 9
System.out.println(a + b); // prints 10
System.out.println(a + (++b)); //prints 11
System.out.println(a + b); // prints 11

System.out.println(12 / 3); // 4
System.out.println(11 / 3); // 3
```

<!-- attr: { hasScriptWrapper: true, showInPresentation: true} -->
<!-- #   Arithmetic Operators - Examples -->

*   _Example:_ Arithmetic operators with floating-point numbers

```java
System.out.println(11.0 / 3); // prints 3.666666667
System.out.println(11 / 3.0); // prints 3.666666667

System.out.println(11 % 3);   // prints 2
System.out.println(11 % -3);  // prints 2
System.out.println(-11 % 3);  // prints -2
```

<!-- attr: { hasScriptWrapper: true, showInPresentation: true} -->
<!-- #   Arithmetic Operators - Examples -->
*   _Example:_ Arithmetic operators resulting to `inf` or `nan`

```java
System.out.println(1.5 / 0.0);  // prints inf
System.out.println(-1.5 / 0.0); // prints -inf
System.out.println(0.0 / 0.0);  // prints nan

System.out.println(5 / 0); // compile error

int x = 0;
System.out.println(5 / x); // throws exception
```

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Arithmetic Operators -->
##    [Demo](http://)


<!-- attr: {hasScriptWrapper: true} -->
#   Logical Operators

*   Logical operators **take Booleanean operands** and **return Booleanean** result
*   Used to create complex expressions
*   Operator `!` turns `true` to `false` and `false`
to `true`

#   Logical OR

*   The result of OR is:
    *   `true` if any of the operands is `true`
    *   `false` if all the operands are `false`

| Operation          | Result     |
| :----------------: | ---------- |
| false **II** false | **false**  |
| false **II** true  | **true**   |
| true **II** false  | **true**   |
| true **II** true   | **true**   |

#   Logical AND

*   The result of AND is:
    *   `true` only if all of the operands are `true`
    *   `false` if any of the operands is `false`

| Operation          | Result     |
| :----------------: | ---------- |
| false **&&** false | **false**  |
| false **&&** true  | **false**  |
| true **&&** false  | **false**  |
| true **&&** true   | **true**   |

#   Logical XOR

*   The result of XOR is:
    *   `true` if the two operands have different values
    *   `false` if the two operands have equal values

| Operation         | Result     |
| :---------------: | ---------- |
| false **^** false | **false**  |
| false **^** true  | **true**   |
| true **^** false  | **true**   |
| true **^** true   | **false**  |

<!-- attr: {hasScriptWrapper: true} -->
#   Logical Operators: Example

*   _Example_
```java
Boolean a = true;
Boolean b = false;
System.out.println(a && b); // false
System.out.println(a || b); // true
System.out.println(a ^ b); // true
System.out.println(!b); // true
System.out.println(b || true); // true
System.out.println(b && true); // false
System.out.println(a || true); // true
System.out.println(a && true); // true
System.out.println(!a); // false
System.out.println((5>7) ^ (a==b)); // false
```

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Logical Operators -->
##    [Demo](https://github.com/TelerikAcademy/CPlusPlusFundamentals/blob/master/04.%20Operatos-and-expressions/demos/2.%20logical-operators.cpp)

<!-- #   Bitwise Operators
##    Working with bits -->

#   Bitwise Operators
*   Bitwise operators are used only on integers
    *   They lookup/change the bits
    *   `~`, `&`, `|`, `>>` and `<<`
*   Bitwise operator `~` turns all bites with value 0 to bites with value 1
    *   And all bites with value 1 to bites with value 0
    *   Like `!` for boolean expressions but **bit by bit**
*   The operators `|`, `&` and `^` behave like `||`, `&&` and `^` for boolean expressions but **bit by bit**
*   The `<<` and `>>` **move the bits** (left or right)

#   Bitwise OR

*   Much like logical OR, but bit by bit:

| Operation | Result bit |
| :-------: | ---------- |
| 0 **I** 0 | 0          |
| 0 **I** 1 | 1          |
| 1 **I** 0 | 1          |
| 1 **I** 1 | 1          |

#   Bitwise AND

*   Much like logical AND, but bit by bit:

| Operation | Result bit |
| :-------: | ---------- |
| 0 **&** 0 | 0          |
| 0 **&** 1 | 0          |
| 1 **&** 0 | 0          |
| 1 **&** 1 | 1          |


#   Bitwise XOR

*   Much like logical XOR, but bit by bit:

| Operation | Result bit |
| :-------: | ---------- |
| 0 **^** 0 | 0          |
| 0 **^** 1 | 1          |
| 1 **^** 0 | 1          |
| 1 **^** 1 | 0          |

<!-- attr: {hasScriptWrapper: true} -->
#   Bitwise Operators Example:

*   Bitwise operators are used on integer numbers (short, char, int, long, long long, etc...)
*   Bitwise operators **are applied bit by bit**
*   _Examples_

```java
int a = 3;                    // 00000000 00000011
int b = 5;                    // 00000000 00000101
System.out.println(a | b));      // 00000000 00000111
System.out.println(a & b));      // 00000000 00000001
System.out.println(a ^ b));      // 00000000 00000110
System.out.println(~a & b));     // 00000000 00000100
System.out.println(a << 1));     // 00000000 00000110
System.out.println(a >> 1));     // 00000000 00000001
```

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Bitwise OR, AND and XOR -->
##    [Demo](https://github.com/TelerikAcademy/CPlusPlusFundamentals/blob/master/04.%20Operatos-and-expressions/demos/3.%20bitwise-operators.cpp)

#   Bitwise Shift left and shift right

*   Bitwise shift operators (`<<` and `>>`) are performed on integer numbers
    *   They move the bits by the provided number to the left or right
*   _Example:_

| Op          | Res    | Explanation |
| :---------: | ------ | ----------------------------------- |
| 7 **<<** 2  | 28     | **0000 0111** becomes **0001 1100** |
| 27 **>>** 2 | 6      | **0001 1011** becomes **0000 0110** | <!-- .element: style="font-size:45px" -->

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Bitwise Shift Operators -->
##    [Demo](https://github.com/TelerikAcademy/CPlusPlusFundamentals/blob/master/04.%20Operatos-and-expressions/demos/4.%20bitwise-shift.cpp)


#   Comparison Operators

*   Comparison operators are used to compare variables
`==`, `<`, `>`, `>=`, `<=`, `!=`
    *   They are the same as in math
*   _Example:_
```java
int a = 5;
int b = 4;
System.out.println(a >= b)); // true
System.out.println(a != b)); // true
System.out.println(a == b)); // false
System.out.println(a == a)); // true
System.out.println(a != ++b)); // false
System.out.println(a > b)); // false
```

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- # Comparison Operators -->
##  [Demo](https://github.com/TelerikAcademy/CPlusPlusFundamentals/blob/master/04.%20Operatos-and-expressions/demos/5.%20comparisson-operators.cpp)

<!-- section start -->

<!-- attr: {class:'slide-section', id: 'assignment-operators', showInPresentation: true} -->
<!-- #   Assignment Operators
##    Assigning values -->

#   Assignment Operators

*   Assignment operators are used to **assign a value** to a variable ,
    *   `=`, `+=`, `-=`, `|=`, ...
*  _Example:_

```java
int x = 6;
int y = 4;
System.out.println(y *= 2)); // 8
int z = y = 3; // y=3 and z=3
System.out.println(z); // 3
System.out.println(x |= 1)); // 7
System.out.println(x += 3)); // 10
System.out.println(x /= 2)); // 5
```
<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Assignment Operators -->
##    [Demo](https://github.com/TelerikAcademy/CPlusPlusFundamentals/blob/master/04.%20Operatos-and-expressions/demos/6.%20assignment-operators.cpp)

<!-- attr: {class: 'slide-section', id: 'other-operators', showInPresentation: true} -->
<!-- #   Other Operators
##    `new`, `()`, etc... -->

#   Other Operators

*   With  `.` **access object members**
*   With `[]` use **array's indexers**
*   Parentheses `( )` are used to **override the default operator precedence**
*   Class cast operator `(type)` is used to **cast one compatible type to another**
*   Conditional operator `?:` returns a **value base on an bool expression**
*   With the `new` operator **create new objects**

<!-- section start -->

<!-- attr: {class: 'slide-questions', id:"questions"} -->
#   Operators and Expression
##    Questions

<!-- section start -->
<!-- attr: {id: ''} -->
#

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

* Operators in Java and Operator Precedence
	* Arithmetic Operators
	* Logical Operators
	* Bitwise Operators
	* Comparison Operators
	* Assignment Operators
	* Other Operators
* Implicit and Explicit Type Conversions
* Expressions

<!-- section start -->

<!-- attr: { id:'operators', class:'slide-section', showInPresentation:true } -->
<!-- # Operators in Java
##	Arithmetic, Logical, Comparison, Assignment, Etc. -->

# What is an Operator?
* **Operator** is an **operation performed over data** at runtime
  * Takes one or more arguments (**operand**)
  * Produces a new value
* Operators have **precedence**
  * Precedence defines which will be evaluated first
* **Expressions** are sequences of operators and operands that are evaluated to a single value

# Operators in Java
* Operators in Java :
  * **Unary** – take one operand
  * **Binary** – take two operands
  * **Ternary** ( ? : ) – takes three operands
* Except for the assignment operators, all binary operators are left-associative
* The assignment operators and the conditional operator ( ? : ) are right-associative

<!-- attr: { hasScriptWrapper:true, style:'font-size:0.75em' } -->
# Categories of Operators in Java
| Category             | Operators                         |
| -------------------- | --------------------------------- |
| Arithmetic           | `+ - *  /  %  ++  --`               |
| Logical              | `&&  II  ^  !  `                    |
| Binary               | `& ^ ~ << >>` I                     |
| Comparison           | `== != < > <= >=`                   |
| Assignment           | `= += -= *= /= %=` <br/>`&= ^= <<= >>=` I`=` |
| String Concatenation | `+`                                 |
| Type Conversion      | `is as typeof`                      |
| Other                | `. [ ] ( ) ? : new`                 |

<!-- attr: { class:'slide-section', showInPresentation:true } -->
<!-- # Operator Precedence
##  Which operators are applied first? -->

<!-- attr: { style:'font-size:0.8em' } -->
# Operator Precedence
| Precedence | Operators                         |
| ---------- | --------------------------------- |
| Highest    | `()`                              |
|            | `++ -- (postfix) new typeof`      |
|            | `++ -- (prefix) + - (unary) ! ~`  |
|            | `* / %`                           |
|            | `+ -`                             |
|            | `<< >>`                           |
|            | `< > <= >= is as`                 |
|            | `== !=`                           |
|            | `&`                               |
|

<!-- attr: { hasScriptWrapper:true, showInPresentation:true, style:'font-size:0.8em' } -->
<!-- # Operator Precedence -->
| Precedence | Operators                         |
| ---------- | --------------------------------- |
|            | `^`                               |
|            | I                                 |
|            | `&&`                              |
|            | `II`                              |
|            | `?:`                              |
| Lowest     | `= *= /= %= += -=` <br/> `<<= >>= &= ^= `I`=` |

* **Parenthesis operator** always has highest precedence
* _Note_: prefer using parentheses, even when it seems stupid to do so

<!-- section start -->
<!-- attr: {class: 'slide-section', id: 'arithmetic-operators', showInPresentation: true} -->
<!-- # Arithmetic Operators
##  Like in Math -->

# Arithmetic Operators
* Arithmetic operators `+`, `-`, `*` are the same as in math
* Division operator `/` if used on integers returns integer (without rounding) or remainder
* Division operator `/` if used on real numbers returns real number or `Infinity` or `NaN`
* Remainder (Modulus) operator `%` returns the remainder from division of integers
* The special addition operator `++` increments a variable

<!-- attr: { hasScriptWrapper:true, showInPresentation:true } -->
<!-- #   Arithmetic Operators -->
*  _Example:_ Perimeter and area of a square

```java
int squarePerimeter = 17;
double squareSide = squarePerimeter / 4.0;
double squareArea = squareSide * squareSide;

System.out.println(squareSide); //prints 4.25

System.out.println(squareArea); // prints 18.0625
```

<!-- attr: { hasScriptWrapper:true, showInPresentation:true } -->
<!-- #   Arithmetic Operators -->
*   _Example:_ Arithmetic operators with `integer` numbers

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
<!-- #   Arithmetic Operators -->

*   _Example:_ Arithmetic operators with `floating-point` numbers

```java
System.out.println(11.0 / 3); // prints 3.666666667
System.out.println(11 / 3.0); // prints 3.666666667

System.out.println(11 % 3);   // prints 2
System.out.println(11 % -3);  // prints 2
System.out.println(-11 % 3);  // prints -2
```

<!-- attr: { hasScriptWrapper: true, showInPresentation: true} -->
<!-- #   Arithmetic Operators -->
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

<!-- section start -->
<!-- attr: { class:'slide-section' } -->
# Logical Operators

<!-- attr: { hasScriptWrapper:true, showInPresentation:true } -->
<!-- # Logical Operators -->
* Logical operators **take Booleanean operands** and **return Booleanean** result
* Used to create complex expressions
* Operator `!` turns `true` to `false` and `false` to `true`

# Logical `OR`
* The result of OR is:
  * `true` if any of the operands is `true`
  * `false` if all the operands are `false`

| Operation          | Result     |
| :----------------: | ---------- |
| false **II** false | **false**  |
| false **II** true  | **true**   |
| true **II** false  | **true**   |
| true **II** true   | **true**   |

# Logical `AND`
* The result of AND is:
  * `true` only if all of the operands are `true`
  * `false` if any of the operands is `false`

| Operation          | Result     |
| :----------------: | ---------- |
| false **&&** false | **false**  |
| false **&&** true  | **false**  |
| true **&&** false  | **false**  |
| true **&&** true   | **true**   |

# Logical `XOR`
* The result of XOR is:
  * `true` if the two operands have different values
  * `false` if the two operands have equal values

| Operation         | Result     |
| :---------------: | ---------- |
| false **^** false | **false**  |
| false **^** true  | **true**   |
| true **^** false  | **true**   |
| true **^** true   | **false**  |

<!-- attr: {hasScriptWrapper: true} -->
# Logical Operators: Example

* _Example_

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
##    [Demo]()

<!-- section start -->
<!-- attr: {  class:'slide-section', showInPresentation:true } -->
# Bitwise Operators
##  Working with bits

<!-- attr: { hasScriptWrapper:true, showInPresentation:true } -->
<!-- #   Bitwise Operators -->
* Bitwise operators are used only on integers
  * They lookup/change the bits
  * `~`, `&`, `|`, `>>` and `<<`
* Bitwise operator `~` 
  * Turns all bits with value `0` to bits with value `1`
  * Turns all bits with value `1` to bits with value `0`
    * Like `!` for boolean expressions but **bit by bit**
* The operators `|`, `&` and `^` behave like `||`, `&&` and `^` for boolean expressions but **bit by bit**
* The `<<` and `>>` **move the bits** (left or right)

# Bitwise OR
* Much like logical OR, but bit by bit:

| Operation | Result bit |
| :-------: | ---------- |
| 0 **I** 0 | 0          |
| 0 **I** 1 | 1          |
| 1 **I** 0 | 1          |
| 1 **I** 1 | 1          |

# Bitwise AND
* Much like logical AND, but bit by bit:

| Operation | Result bit |
| :-------: | ---------- |
| 0 **&** 0 | 0          |
| 0 **&** 1 | 0          |
| 1 **&** 0 | 0          |
| 1 **&** 1 | 1          |


# Bitwise XOR
* Much like logical XOR, but bit by bit:

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
<!-- # Bitwise OR, AND and XOR -->
##  [Demo]()

# Bitwise Shift left and shift right
* Bitwise shift operators (`<<` and `>>`) are performed on integer numbers
  * They move the bits by the provided number to the left or right
* _Example:_

| Op          | Res    | Explanation |
| :---------: | ------ | ----------------------------------- |
| 7 **<<** 2  | 28     | **0000 0111** becomes **0001 1100** |
| 27 **>>** 2 | 6      | **0001 1011** becomes **0000 0110** | <!-- .element: style="font-size:45px" -->

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- # Bitwise Shift Operators -->
##  [Demo]()


<!-- section start -->
<!-- attr: {  class:'slide-section', showInPresentation:true } -->
# Comparison Operators

# Comparison Operators
* Comparison operators are used to compare variables
`==`, `<`, `>`, `>=`, `<=`, `!=`
  * They are the same as in math
* _Example:_
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
<!-- # Assignment Operators
##  Assigning values -->

# Assignment Operators
* Assignment operators are used to **assign a value** to a variable ,
    * `=`, `+=`, `-=`, `|=`, ...
* _Example:_

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
<!-- attr: { class:'slide-section', showInPresentation:true } -->
<!-- # Assignment Operators -->
##  [Demo]()

<!-- attr: { class:'slide-section', id:'other-operators', showInPresentation:true } -->
# Other Operators
##  `new`, `()`, etc...

<!-- attr: { showInPresentation:true } -->
<!-- # Other Operators -->
* String concatenation operator `+` is used to concatenate strings 
  * If the second operand is not a string, it is converted to string automatically

```java
String first = "First";
String second = "Second";
System.out.println(first + second); // FirstSecond
String output = "The number is : ";
int number = 5;
System.out.println(output + number); // The number is : 5
```

<!-- attr: { showInPresentation:true } -->
<!-- # Other Operators -->
* With  `.` **access object members**
* With `[]` use **array's indexers**
* Parentheses `( )` are used to **override the default operator precedence**
* Class cast operator `(type)` is used to **cast one compatible type to another**
* Conditional operator `?:` returns a **value base on an bool expression**
* With the `new` operator **create new objects**
* 
<!-- attr: { class:'slide-section', showInPresentation:true } -->
<!-- # Other Operators -->
##  [Demo]()

<!-- section start -->
<!-- attr: { class:'slide-section' } -->
# Implicit and Explicit Type Conversions

# Implicit Type Conversions
* `Implicit  type conversion`
  * Automatic conversion of value of one data type to value of another data type
  * Allowed when no loss of data is possible
    * "Larger" types can implicitly take values of smaller "types"
  * _Example_:

```java
int i = 5;
long l = i;
```

# Explicit Type Conversions
* `Explicit type conversion`
  * Manual conversion of a value of one data type to a value of another data type
  * Allowed only explicitly by `(type)` operator
    * Required when there is a possibility of loss of data or precision
  * _Example_:

```java
long l = 5;
int i = (int) l;
```

# Type Conversions
* Example of implicit and explicit conversions:

```java
float heightInMeters = 1.74f; // Explicit conversion
double maxHeight = heightInMeters; // Implicit

double minHeight = (double) heightInMeters; // Explicit

float actualHeight = (float) maxHeight; // Explicit

float maxHeightFloat = maxHeight; // Compilation error!
```

* _Note_: Explicit conversion may be used even if not required by the compiler



<!-- attr: { class:'slide-section', showInPresentation:true } -->
<!-- # Implicit and Explicit Type Conversions -->
##  [Demo]()

<!-- section start -->
<!-- attr: { class:'slide-section' } -->
# Expressions

<!-- attr: { showInPresentation:true } -->
<!-- # Expressions -->
* Expressions are sequences of operators, literals and variables that are evaluated to some value
* _Examples_:

```java
int r = (150-20) / 2 + 5; // r=70
// Expression for calculation of circle area
double surface = Math.PI * r * r;
// Expression for calculation of circle perimeter
double perimeter = 2 * Math.PI * r;
```

<!-- attr: { hasScriptWrapper:true, showInPresentation:true } -->
<!-- # Expressions -->
* `Expressions` have:
  * Type (integer, real, boolean, ...)
  * Value
* _Examples_:

<div style="height:10%"></div>

```java
int a = 2 + 3; // a = 5
int b = (a+3) * (a-4) + (2*a + 7) / 4;  // b = 12
bool greater = (a > b) || ((a == 0) && (b == 0));
```

<div class="fragment">
  <div class="balloon" style="width:300px; left:10%; top:48%">Expression of type `int` Calculated at compile time</div>
  <div class="balloon" style="width:270px; left:50%; top:52%">Expression of type `int` Calculated at runtime</div>
  <div class="balloon" style="width:270px; left:30%; top:72%">Expression of type `bool` Calculated at runtime</div>
</div>

<!-- attr: { class:'slide-section', showInPresentation:true } -->
<!-- # Expressions -->
##  [Demo]()

<!-- section start -->
<!-- attr: { class:'slide-section', id:"questions"} -->
# Questions
## Operators and Expression

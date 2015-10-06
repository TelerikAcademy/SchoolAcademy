<!-- section start -->

<!-- attr: {id: 'title', class: 'slide-title', hasScriptWrapper: true} -->

# Data Types and Variables
##  Numbers, strings and stuff
<div class="signature">
    <p class="signature-course">Java Fundamentals</p>
    <p class="signature-initiative">Telerik School Academy</p>
    <a href="http://academy.telerik.com" class="signature-link">http://academy.telerik.com</a>
</div>

<!-- section start -->
<!-- attr: {id: 'table-of-contents'} -->
# Table of Contents

*   Integer values
    *   `int`, `long`, `short`, etc...
*   Floating-point values
    *   `double` and `float`
*   Char values
    *   `char`
*   String values
    *   A sequence of characters
*   Numbers classes
    *   TODO
*   `BigInteger` and `BigDecimal`
*   `char`
*   `String`
    *   Simple operations with string

<!-- section start -->

<!-- attr: {class: 'slide-section', id: 'how-computing-works'} -->
#   How Computing Works?
##  Data types, Variables

<!-- attr: {hasScriptWrapper: true} -->
#   How Computing Works?

*   Computers are machines that process data
    *   Data is stored in the computer memory in **variables**
    *   Variables have **name**, **data type** and **value**
*   Example of variable definition and assignment in Java

```java
int count = 5;
```

*   Data type
<!-- .element: class="balloon fragment" style="top: 50%; left:4%" -->
*   Variable <!-- .element: class="balloon fragment" style="top: 63%; left:12%" -->
*   Optional value <!-- .element: class="balloon fragment" style="top: 50%; left:30%" -->

#   What is a Data Type?

*   A **data type**
    *   is a domain of values of similar characteristics
    *   defines the type of information stored in the computer memory (in a variable)
*   Examples:
    *   Positive integer numbers: `1`, `2`, `3`, ...
    *   Alphabetical characters: `a`, `b`, `c`, ..., `A`, `B`, `C`, ...
    *   Days of week: `Monday`, `Tuesday`, ...

#   Data Type Characteristics

*   A data type has:
    *   **Name** (Java keyword)
    *   **Size** (how much memory is used)
    *   **Default value**
*   Example - Integer numbers in Java
    *   **Name**: `int`
    *   **Size**: `32 bits` (4 bytes)
    *   **Default value**: 0

<!-- section start -->

<!-- attr: {class: 'slide-section', id: 'primitive-data-types'} -->
#   Primitive Data Types
##    Representing Integer and Floating-point numbers, and Symbolic values

<!-- attr: { hasScriptWrapper: true, id: 'integer-data-types'} -->
#   Integer Number Types

* Integer Number types:
  * Represent whole numbers
  * May be signed or unsigned
  * Have range of values, depending on the size of memory used

<!-- attr: { hasScriptWrapper:true, style:'font-size:0.9em' } -->
#   Memory for Integer Number Types

| Name                     |  Size   | Range                |
| ------------------------ | ------- | -------------------- |
| `byte`                   | 1 byte  | -2<sup>7</sup> to 2<sup>7</sup>-1 |
| `short`                  | 2 bytes | -2<sup>15</sup> to 2<sup>15</sup>-1 |
| `int`                    | 4 bytes | -2<sup>31</sup> to 2<sup>31</sup>-1 |
| `long`                   | 8 bytes | -2<sup>63</sup> to 2<sup>63</sup>-1 |
|

* In Java SE 8 and later, you can use `int` and `long` data types to represent an unsigned integer data type

<!-- attr: { hasScriptWrapper:true, style:'font-size:0.9em' } -->
# Integer types - Explained
* `int` - the most common integer type
  * from -2 147 483 648 to 2 147 483 647
* `byte` - for very small integers
  * from -128 to 127
* `short` - **`s`maller** type than `int`
  * from -32,768 to 32,767
* `long` - **`l`arger** type than `int`
  * -9 223 372 036 854 775 808 to 9 223 372 036 854 775 807
* `BigInteger`
  * For large numbers
  * Has no limit to size
  
<!-- attr: {hasScriptWrapper: true} -->
# Integer Types - Char
* TODO - redo whole slide

* C++ works with **two char types**
  * One for storing **characters**
* Writing simply `char` invokes the **character type**
* **To store numbers**
  * Should write down `signed` or `unsigned`
  * Tell the compiler we need char for numbers
* _Note_: don’t store numbers in char, unless you have a very good reason

<!-- attr: {class: 'slide-section'} -->
# Using Integer types
##  Live Demo

<!-- attr: { id: 'bool-data-type'} -->
# Boolean type (`boolean`)

* Java has a **Boolean type**
  * `boolean` – a value which is either `true` or `false`
  * Always takes up 1 byte
    * 1 bit would be enough, but memory is addressed per bytes, not per bit
  * Takes `true`, `false`, or **numeric values**
    * **Any non-zero numeric value** is interpreted as `true`
    * **0 (zero)** is interpreted as `false`

<!-- attr: {class: 'slide-section'} -->
#   Using `boolean`
##    Live Demo

<!-- attr: {id: 'floating-point-data-types'} -->
#   Floating-point Data Types

*   Floating-point numbers:
    *   Represent real numbers with approximations
        *   2.3, 0.7, -Infinity, -1452342.2313, etc...
    *   Range of values, depending on memory used
    *   Accuracy, depending on memory used

<!-- attr: { style:"font-size:0.85em", hasScriptWrapper:true } -->
#   Floating-point Data Types - Memory

| Name          |  Size   | Precision  | Range                         |
| ------------- | ------- | ---------- | ----------------------------- |
| `float`       | 4 bytes | ~7 digits  | ±1.5 × 10<sup>−45</sup> to</br> ±3.4 × 10<sup>38</sup>   |
| `double`      | 8 bytes | ~15 digits | ±5.0 × 10<sup>−324</sup> to</br> ±1.7 × 10<sup>308</sup> |
| `BigDecimal` | 8 bytes | ~15 digits | ±5.0 × 10<sup>−324</sup> to</br> ±1.7 × 10<sup>308</sup> |

<!-- attr: {hasScriptWrapper: true} -->
#   Floating-point Data Types - Explained

*   `float` – fast, lower-precision
*   `double` – slower, higher precision
*   `BigDecimal`
    *   High precision on some systems, not widely used
*   No guarantee on exact size (as with integers)
    *   The only sure thing is:
    ```cpp
      sizeof(float)<=sizeof(double)<=sizeof(BigDecimal)
    ```

<!-- attr: {class: 'slide-section', id: 'floating-point-demo'} -->
#   Using Floating-Point Types
##    Live Demo

<!-- section start -->

<!-- attr: {class: 'slide-section', id: 'declaring-and-using-variables'} -->
#   Declaring and Using Variables
##    Storing data

<!-- attr: {hasScriptWrapper: true} -->
#    Declaring Variables

*   When declaring a variable we:
    *   Specify its type
    *   Specify its name (called identifier)
    *   May give it an initial value
*   The syntax to declare a variable in C++ is the following:

```
<data_type> <identifier> [= <initialization>];
```

*   _Example:_

```cpp
int height = 200;
```

#   Identifiers

*   Variable names are called **identifiers**
*   All "words" in a language are identifiers
    *   Data types
    *   Operators
    *   Functions
*   Identifiers in C++ are case-sensitive
    *   `THis != THIS != this`
        *   (the last being a reserved keyword)

<!-- attr: { id:'identifiers-limitations', style: 'font-size: 45px'} -->
#   Identifiers in C++

*   C++ identifiers
    *   One or more **letters**, **digits** or **underscores**
    *   **Start with a letter** or **underscore**
        *   Avoid starting underscores & double underscores
        *   May be compiler-reserved
    *   Can’t be a **standard reserved keyword**
    *   Can’t be a **name of operator representations**
    *   Can’t be a **reserved compiler keyword**
        *   Some compilers reserve their own keywords
*   **Bad C++ identifiers are detected compile-time**
    *   No need to remember all rules
    *   Compiler will warn you about errors

<!-- attr: {hasScriptWrapper: true} -->
#   Identifiers - Examples

*   The following identifiers are **correct**:

```cpp
int New = 2;
int _2Pac;

string greeting = "Hello";
int n = 100;
int numberOfClients = 100;
int numberOfPrivateClientOfTheFirm = 100;
```
<!-- .element: style="font-size: 1.5rem" -->

*   The following identifiers are **incorrect**:

```cpp
// new is a keyword
int new;

// Cannot begin with a digit
int 2Pac;
```

<!-- attr: {class: 'slide-section'} -->
# Valid C++ Identifiers
##  Live Demo


<!-- section start -->

<!-- attr: {class: "slide-section", id: 'variable-scope'} -->
# Variable Scope
##  Where are variables accessible?

# Variable Scope
* **Scope** of a variable
  * **Lines in code**, where the identifier is valid
  * i.e. "where the variable is still alive"
* Two kinds of scope in C++
  * **Global** (almost):
    * The variable is **visible and usable** by **all functions** in the program
  * **Local**:
    * The variable is **visible and usable** **only in the current block**
        * i.e. in the inner-most { … }

<!-- attr: {hasScriptWrapper: true} -->
# Variable Scope - Examples
* Making a local variable
    * Declare it in a block

```cpp
int main() {
	int a = 5; //local variable
	return 0;
}
```

*   Making a global variable
    *   Declare it outside any function or class

```cpp
int a = 5; //global variable
int main() {
  a++;
  return 0;
}
```

<!-- attr: {class: 'slide-section'} -->
#   Variable Scope
##    Live Demo

<!-- section start -->

<!-- attr: {class: 'slide-section', id: 'variable-initialization'} -->
#   Initializing Variables
##    Ways to Initialize, Default values

<!-- attr: {hasScriptWrapper: true} -->
# Initializing Variables

* C++ supports **two ways of initializing**
  * Through the **assignment operator**

```cpp
int a = 5;
```

    *   Through **calling the type constructor**
```cpp
int a(5);
```
*   Both ways are equivalent in the case of primitives

<!-- attr: {class: 'slide-section'} -->
#   Initializing Variables
##  Live Demo

#   Initializing Variables – Defaults

*   What happens to uninitialized variables?

```cpp
int a;
cout << a;
```

*   C++ allows **operating on uninitialized** variables
    *   Actually variables get initialized sometimes
    *   Even if not initialized, variables get values
        *   Whatever was in that part of memory
        *   Where the variable is placed

#   Initializing Variables - Defaults (cont.)

*   Initialization **depends on the variable scope**
    *   If the variable is **global**
        *   Initialized to default type value
        *   E.g. for integers 0
    *   If the variable is **local**
        *   Undefined in standard
        *   Usually garbage values from memory
        *   Whatever values in memory marked free

<!-- attr: {class: 'slide-section'} -->
#   Initializing Variables - Defaults
##    Live Demo

<!-- section start -->

<!-- attr: {class: 'slide-questions', id:"questions"} -->
#   Data Types and Variables
##    Questions

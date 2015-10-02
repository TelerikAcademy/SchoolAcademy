<!-- section start -->

<!-- attr: {id: 'title', class: 'slide-title', hasScriptWrapper: true} -->
#   Conditional Statements
##    Become master jedi of control flow
<div class="signature">
    <p class="signature-course">C++ Fundamentals</p>
    <p class="signature-initiative">Telerik Algo Academy</p>
    <a href="http://academy.telerik.com" class="signature-link">http://academy.telerik.com</a>
</div>

<!-- section start -->
<!-- attr: {id: 'table-of-contents'} -->
#   Table of Contents

*   `if-else` statements
*   Nested `if-else-if` statements
*   `switch-case` statements

<!-- section start -->

<!-- attr: {class: 'slide-section', id: 'if-statement', showInPresentation: true} -->
<!-- #   The `if` Statement
##    The easiest way to use control flow -->

#   The `if` Statement

*   The most simple conditional statement
*   Enables you to test for a condition
*   Branch to different parts of the code depending on the result
*   The simplest form of an if statement:

```cpp
if (condition) {
    statements;
}
```

#   Condition and Statement
*   The condition can be:
    *   **Boolean** variable
    *   **Boolean logical expression**
    *   **Comparison** expression
*   The condition can be of **any type**
    *   Everything is TRUE, except for 0 and FALSE
*   The statement can be:
    *   **Single statement** ending with a semicolon
    *   **Block enclosed in braces** 

#   How `if` works?

*   **TODO** insert image
*   The **condition is evaluated**
    *   If it is `true`, the statement is **executed**
    *   If it is `false`, the statement is **skipped** 

#   _Example:_ `if`

*   Find the bigger between two numbers:

```cpp
cout << "Enter two numbers:" << endl;

int biggerNumber;
int smallerNumber;
cin >> biggerNumber >> smallerNumber;

if (smallerNumber > biggerNumber) {
    biggerNumber = smallerNumber;
}

cout << "The greater number is: " << biggerNumber << endl;
```

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   The `if` Statement -->
##    [Demo](https://github.com/TelerikAcademy/CPlusPlusFundamentals/blob/master/05.%20Conditional-statements/demos/1.%20the-if-statement.cpp)

<!-- section start -->

<!-- attr: {class:'slide-section', id: 'if-else-statement', showInPresentation: true} -->
<!-- #   The `if-else` Statement
##  Fork your code -->

#   The `if-else` Statement
*   The `if-else` statement is more complex and useful
    *   Executes one branch if the condition is true, and another if it is false 
*   The simplest form of an `if-else` statement:

```cpp
if (expression) {
    statement1; 
} else {
    statement2; 
}
```

#   How `if-else` Works?
*   **TODO** insert image
*   The condition is evaluated
    *   If it is `true`, the **first statement is executed**
    *   If it is `false`, the **second statement is executed**

#   _Example:_ `if-else`

*   _Example:_ Check if a number if it is odd or even

```cpp
int number;
cin >> number;

if (number % 2 == 0) {
    cout << "This number is even!" << endl;
} else {
    cout << "This number is odd!" << endl;
}
```

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   The `if-else` Statement -->
##  [Demo](https://github.com/TelerikAcademy/CPlusPlusFundamentals/blob/master/05.%20Conditional-statements/demos/2.%20the-if-else-statement.cpp)

<!-- section start -->

<!-- attr: {class: 'slide-section', id: 'nested-if-else', showInPresentation: true} -->
<!-- #   Nested `if-else` Statements
##    Creating More Complex Logic -->

<!-- attr: {hasScriptWrapper: true} -->
#   Nested `if-else` Statements

*   `if` and `if-else` statements can be nested
    *   i.e. **used inside** another `if` or `else` statement
    *   Every `else` corresponds to **its closest preceding** `if`
    
```cpp
if (expression) {
    if (expression)  {
        statement;
    } else {
        statement;
    }
} else {
    statement;
} 
```
    
#   _Example:_ Nested if Statements
*   _Example:_ comparing two integers: 

```cpp
int first, second;
cin >> first >> second;

if (first == second) {
    cout << "These two numbers are equal." << endl;
} else {
    if (first > second) {
        cout << "The first number is bigger." << endl;
    } else {
        cout << "The second is bigger." << endl;
    }
}
```

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   Nested `if-else` Statements -->
##   [Demo](https://github.com/TelerikAcademy/CPlusPlusFundamentals/blob/master/05.%20Conditional-statements/demos/3.%20nested-if-else-statements.cpp)

#   Nested if – Good Practices

*   **Always** use { … } blocks to avoid ambiguity
    *   Even when a single statement follows
*   **Avoid using more than three levels** of nested if statements
*   Put the case you **normally expect to process first**
    *   Then write the unusual cases
*   Arrange the code to make it more readable

<!-- section start -->

<!-- attr: {class: 'slide-section', id: 'if-else-if-statements', showInPresentation: true} -->
<!-- #   The `if-else-if` Statement
##  Make more than two branches -->

#   The `if-else-if` Statement
*   C++ supports evaluating more than one `if` statements
    *   If the first `if` statement is `false`, evaluate the second `if` statement, etc..
    
```cpp
if(condition1) {
  statement1;
} else if(condition2){
  //condition1 is false
  statement2;
} else {
  //condition1 and condition2 are false
  statement3;
}
```

#   Example `if-else-if` Statement

*   _Example:_ Check if a Latin leter is a **vowel** or **consonant**

```cpp
int ch = 'X';
if (ch == 'A' || ch == 'a') {
    cout << "Vowel [ei]" << endl;
}
else if (ch == 'E' || ch == 'e') {
    cout << "Vowel [i:]" << endl;
}
else if  …
else {
  cout << "The Consonant [" << ch << "] << endl;  
}
```

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   The `if-else-if` Statement -->
##    [Demo](https://github.com/TelerikAcademy/CPlusPlusFundamentals/blob/master/05.%20Conditional-statements/demos/4.%20the-if-else-if-statement.cpp)

<!-- section start -->

<!-- attr: {class: 'slide-section', id: 'switch-case', showInPresentation: true} -->
<!-- #   The `switch-case` Statement
##    Make Many Comparisons at Once -->

#   The `switch-case` Statement

*   The `switch-case` statement **selects for execution a statement from a list** depending on the value of the switch expression 

```cpp
int day;
cin >> day;

switch (day) {
  case 1: cout << "Monday" << endl; break;
  case 2: cout << "Tuesday" << endl; break;
  case 3: cout << "Wednesday" << endl; break;
  case 4: cout << "Thursday" << endl; break;
  case 5: cout << "Friday" << endl; break;
  case 6: cout << "Saturday" << endl; break;
  case 7: cout << "Sunday" << endl; break;
  default: cout << "Error!" << endl; break;
}
```

#   How `switch-case` Works?

1.  The expression is evaluated
2.  When one of the constants specified in a case label is equal to the expression
    *   The statement that corresponds to that case is executed
3.  If no case is equal to the expression
    *   If there is default case, it is executed
    *   Otherwise the control is transferred to the end point of the switch statement 

<!-- attr: {class: 'slide-section', showInPresentation: true} -->
<!-- #   The `switch-case` Statement -->
##    [Demo](https://github.com/TelerikAcademy/CPlusPlusFundamentals/blob/master/05.%20Conditional-statements/demos/5.%20switch-case-statement.cpp)

#   Good Practices using `switch-case`

*   There must be a separate case for every normal situation
*   Put the normal case first
    *   Put the most frequently executed cases first and the least frequently executed last
*     Order cases alphabetically or numerically
*   In default use case that cannot be reached under normal circumstances

<!-- section start -->

<!-- attr: {class: 'slide-questions', id:"questions"} -->
#   Conditional Statements
##    Questions

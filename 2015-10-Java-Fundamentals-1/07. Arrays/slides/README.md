<!-- section start -->

<!-- attr: { id:'title', class:'slide-title', hasScriptWrapper:true } -->

# Arrays
##  Creating and using arrays
<div class="signature">
    <p class="signature-course">Java Fundamentals - Part 1</p>
    <p class="signature-initiative">Telerik School Academy</p>
    <a href="http://academy.telerik.com" class="signature-link">http://academy.telerik.com</a>
</div>

<!-- section start -->
<!-- attr: {id: 'table-of-contents'} -->
# Table of Contents
- Creating arrays
- Accessing Array Elements
- Iterating arrays
- One-dimensional
- Multi-dimentional arrays

<!-- section start -->
<!-- attr: { id:'', class:'slide-section', showInPresentation:true } -->
<!-- # Declaring and Creating Arrays -->

<!-- attr: { hasScriptWrapper:true } -->
# What are Arrays?
- An `array` is a sequence of elements
- All elements are of the same type
- The order of the elements is fixed
- Has fixed size (`Array.length`)

<img class="slide-image" src="imgs/array.png" style="height:30%; left:10%" />

# Declaring Arrays
- Declaration defines the type of the elements
- Square brackets [] mean "array"
- Examples:
- Declaring array of integers:

```java
int[] myIntArray;
```
- Declaring array of strings:

```java
String[] myStringArray;
```

<!-- attr: { hasScriptWrapper:true } -->
# Creating Arrays
Use the operator new
Specify array length
Example creating (allocating) array of 5 integers:

```java
myIntArray = new int[5];
```

<img class="slide-image" src="imgs/array-mem.png" style="width:60%; left:10%" />

<!-- attr: { hasScriptWrapper:true } -->
# Creating and Initializing Arrays
- Creating and initializing can be done together:

```java
myIntArray = {1, 2, 3, 4, 5};
```
<img class="slide-image" src="imgs/array-mem.png" style="width:60%; margin-left:10%; position:initial" />

- The `new` operator is not required when using curly brackets initialization

# Creating Array – Example
- Creating an array that contains the names of the days of the week

```java
String[] daysOfWeek =
{
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday",
    "Sunday"
};
```






<!-- section start -->
<!-- attr: { id:'', class:'slide-section' } -->
#
##

<!-- section start -->
<!-- attr: { id:'', class:'slide-section' } -->
#
##

<!-- section start -->
<!-- attr: { id:'', class:'slide-section' } -->
#
##

<!-- section start -->
<!-- attr: { id:'', class:'slide-section' } -->
#
##

<!-- section start -->
<!-- attr: { id:'questions', class:'slide-section', showInPresentation:true } -->
<!-- # Questions
## Arrays -->

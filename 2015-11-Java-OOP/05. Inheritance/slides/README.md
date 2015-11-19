<!-- section start -->

<!-- attr: { class:'slide-title', hasScriptWrapper:true } -->
# Inheritance
## OOP Fundamental Principles
<div class="signature">
    <p class="signature-course">Java OOP</p>
    <p class="signature-initiative">Telerik School Academy</p>
    <a href="http://academy.telerik.com" class="signature-link">http://academy.telerik.com</a>
</div>


<!-- section start -->

<!-- attr: { class:'table-of-contents' } -->
# Table of Contents
* Inheritance - OOP principle
* Inheritance in Java
* Defining Inheritance


<!-- section start -->

<!-- attr: { class:'slide-section', showInPresentation:true } -->
<!-- # Inheritance -->

<!-- attr: { style:'font-size:0.9em' } -->
# Inheritance
* `Inheritance` allows classes to be derived from other classes
* `subclass` `inherit` the characteristics of an existing `superclass`
  * Attributes (**fields**)
  * Operations (**methods**)
* Child class can extend the parent class
  * Add **new fields and methods**
  * **Redefine methods** (modify existing behavior)
* A class can `implement` an interface by providing implementation for all its methods


<!-- attr: { hasScriptWrapper:true } -->
# Types of Inheritance
<img class="slide-image" src="imgs/inheritance.png" style="" />

# Inheritance
* `Inheritance` implicitly gains `all members` from another class
  * All fields, methods, events, …
  * Some members could be inaccessible (hidden)
* The class whose methods are inherited is called **superclass** (`base`, `parent` class)
* The class that gains new functionality is called **subclass**(`derived`, `child` class)

# Inheritance – Benefits
* Inheritance has a lot of benefits
  * Extensibility 
  * Reusability (`code reuse`)
  * Provides abstraction
  * Eliminates redundant code
* Use inheritance for buidling `is-a` relationships
  * E.g. dog `is-a` animal (dogs are kind of animals)
* Don't use it to build `has-a` relationship
  * E.g. dog `has-a` name (dog is not kind of name)

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!-- # Inheritance -->
* Example

<img class="slide-image" src="imgs/inheritance-person.png" style="position:initial; width:60%; margin:0 20%" />

<div class="fragment balloon" style="width:150px; top:19%; left:40%">Base class</div>
<div class="fragment balloon" style="width:150px; top:59%; left:22%">Derived class</div>
<div class="fragment balloon" style="width:150px; top:59%; left:60%">Derived class</div>

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size:0.90em' } -->
# Class Hierarchies
* Classes can be derived from classes that are derived from classes that are derived from classes, and so on
* `Inheritance` leads to a **hierarchies** of <br/>`classes` and/or `interfaces` in an application:
<img class="slide-image" src="imgs/class-hierarchy.png" style="position:initial; width:70%; margin:15px 10%" />


<!-- section start -->

<!-- attr: { class:'slide-section', showInPresentation:true } -->
<!-- # Inheritance in Java -->

# Inheritance in Java
* Every class has one and only one direct **superclass** (single inheritance)
  * Every class is implicitly a subclass of `Object`
* A class can implement several interfaces
* An interface can implement several interfaces


<!-- section start -->

<!-- attr: { class:'slide-section', showInPresentation:true } -->
<!-- # How to Define Inheritance? -->

# How to Define Inheritance?
* Specify the name of the base class after the name of the derived (with colon)

```java
public class Shape
{ … }
public class Circle extends Shape
{ … }

```
* Use the keyword `super` to invoke the parent constructor

```java

```





<!-- section start -->

<!-- attr: { id:'questions', class:'slide-section' } -->
# Questions
## Defining Classes
[link to Telerik Academy Forum](http://telerikacademy.com/Forum/Category/12/telerik-school-academy)
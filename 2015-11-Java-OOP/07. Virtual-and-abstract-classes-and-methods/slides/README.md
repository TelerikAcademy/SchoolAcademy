<!-- section start -->
<!-- attr: { class:'slide-title', hasScriptWrapper:true } -->
# Interfaces, virtual and abstract <br/>classes and methods
<div class="signature">
    <p class="signature-course">Java OOP</p>
    <p class="signature-initiative">Telerik School Academy</p>
    <a href="http://academy.telerik.com" class="signature-link">http://academy.telerik.com</a>
</div>


<!-- section start -->
<!-- attr: { class:'table-of-content', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
# Table of Contents
* Abstraction
* Interfaces
  * Default methods
  * Static methods
* Abstract classes
* Abstract and virtual methods


<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
# Abstraction

<!-- attr: { hasScriptWrapper:true, style:'' } -->
# Abstraction
* `Abstraction` means ignoring irrelevant features, properties, or functions and emphasizing the relevant ones ...
<img class="slide-image" src="imgs/abstractoin.png" style="position:initial; width:80%" />
* ... relevant to the given project
  * With an eye to future reuse in similar projects
* Abstraction helps `managing complexity`

<!-- attr: { showInPresentation:true, style:'' } -->
<!-- # Abstraction -->
* Abstraction is something we do every day
  * Looking at an object, we see those things about it that have meaning to us
  * We **abstract the properties of the object**, and keep only what we need
  * E.g. students get "name" but not "color of eyes"
* Allows us to represent a complex reality in terms of a simplified model
* Abstraction **highlights the properties of an entity that we need** and hides the others

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'' } -->
# Abstraction in OOP
* In object-oriented programming (Java, C#) abstraction is achieved in several ways:
  * Abstract classes 
  * Interfaces
  * Inheritance

<img class="slide-image" src="imgs/abstraction-hierarchy.png" style="width:40%; top:35%; left:50%" />


<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
<!-- # Interfaces -->

# Interfaces
* An `interface` defines a set of operations (methods) that given object should perform
  * Also called "`contract`" for providing a set of operations
  * Defines **abstract behavior**
* Interfaces provide abstractions
  * You invoke the abstract actions
  * Without worrying how it is internally implemented

# Interfaces
* In Java an `interface` is a reference type
  * Similar to a `class`
* Can contain only
  * **constants**, **method signatures**, **nested types**
  * **default methods**, **static methods**
    * Method bodies exist only for default methods and static methods
* Interfaces **cannot be instantiated**
  * They can only be `implemented` by classes or `extended` by other interfaces

# Interfaces: static methods

# Interfaces: default methods

<!-- attr: { class:'slide-section demo', showInPresentation:true } -->
<!-- # Interfaces -->
## [Demo]()


<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
<!-- # Abstract classes -->

# Abstract classes

<!-- attr: { class:'slide-section demo', showInPresentation:true } -->
<!-- # Abstract classes -->
## [Demo]()


<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
<!-- # Abstract and virtual methods -->

# Abstract and virtual methods

<!-- attr: { class:'slide-section demo', showInPresentation:true } -->
<!-- # Abstract and virtual methods -->
## [Demo]()


<!-- section start -->
<!-- attr: { id:'questions', class:'slide-section' } -->
# Questions
## Virtual and abstract classes and methods
[link to Telerik Academy Forum](http://telerikacademy.com/Forum/Category/12/telerik-school-academy)
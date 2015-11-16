<!-- section start -->
<!-- attr: { class:'slide-title', hasScriptWrapper:true } -->
# Defining Classes
##  Classes, Fields, Constructors, Methods, Properties
<div class="signature">
    <p class="signature-course">Java OOP</p>
    <p class="signature-initiative">Telerik School Academy</p>
    <a href="http://academy.telerik.com" class="signature-link">http://academy.telerik.com</a>
</div>


<!-- section start -->
# Table of Contents
* Defining Simple Classes
* Fields
* Access Modifiers
* Using Classes and Objects
* Constructors
* Methods
* Properties
* Keeping the Object State


<!-- section start -->
<!-- attr: { class:'slide-section' } -->
# Defining Simple Classes
<!-- attr: { showInPresentation:true, style:'' } -->
# Classes in OOP
* `Classes` model real-world objects and define
  * `Attributes` (state, properties, fields)
  * `Behavior` (methods, operations)
* **Classes** describe the **structure** of objects
  * **Objects** describe particular **instance** of a class
* **Properties** hold information about the modeled object relevant to the problem
* **Operations** implement object behavior

<!-- attr: { showInPresentation:true, style:'' } -->
# Classes in Java
* Classes in Java can have `members`:
  * Fields, constants, methods, properties, events, constructors, destructors, …
  * Inner types (inner classes, interfaces, delegates, ...)
* Members can have access modifiers (scope)
  * `public`, `private`, `protected`
* Members can be
  * `static` (common) or `specific` for a given object

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'' } -->
# Simple Class Definition

```java
public class Cat extends Animal {
    private String name;
    private String owner;

    public Cat(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    ...
```
<div class="fragment balloon" style="width:250px; top:11%; left:10%">Begin of class definition</div>
<div class="fragment balloon" style="width:230px; top:16%; left:55%">Inherited (base) class</div>
<div class="fragment balloon" style="width:65px; top:23%; left:43%">Fields</div>
<div class="fragment balloon" style="width:120px; top:39%; left:46%">Constructor</div>
<div class="fragment balloon" style="width:70px; top:54%; left:49%">Getter</div>
<div class="fragment balloon" style="width:70px; top:70%; left:62%">Setter</div>


<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'' } -->
# Simple Class Definition

```java
    ...
    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String MakeSound() {
        return "Miauuuuuu!";
    }
}
```
<div class="fragment2 balloon" style="width:150px; top:54%; left:52%">Method</div>
<div class="fragment2 balloon" style="width:230px; top:67%; left:9%">End of class definition</div>

# Class Definition and Members
* `Class definition `consists of:
  * Class declaration
  * Extended/Inherited class or `implemented` interfaces
  * Fields (static or not)
  * Constructors (static or not)
  * Properties (static or not)
  * Methods (static or not)
  * Events, inner types, etc.

<!-- section start -->
<!-- attr: { class:'slide-section' } -->
# Fields


<!-- section start -->
<!-- attr: { class:'slide-section' } -->
# Access Modifiers


<!-- section start -->
<!-- attr: { class:'slide-section' } -->
# Using Classes and Objects


<!-- section start -->
<!-- attr: { class:'slide-section' } -->
# Constructors


<!-- section start -->
<!-- attr: { class:'slide-section' } -->
# Methods


<!-- section start -->
<!-- attr: { class:'slide-section' } -->
# Properties


<!-- section start -->
<!-- attr: { class:'slide-section' } -->
# Keeping the Object State


<!-- section start -->
<!-- attr: { class:'slide-title', showInPresentation:true, hasScriptWrapper:true, style:'' } -->

<!-- section start -->
<!-- attr: { id:'questions', class:'slide-section' } -->
# Questions
## Defining Classes
[link to Telerik Academy Forum](http://telerikacademy.com/Forum/Category/12/telerik-school-academy)
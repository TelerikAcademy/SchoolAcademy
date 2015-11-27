<!-- section start -->

<!-- attr: { class:'slide-title', hasScriptWrapper:true } -->
# Anonymous classes
##  Create classes inline
<div class="signature">
    <p class="signature-course">Java OOP</p>
    <p class="signature-initiative">Telerik School Academy</p>
    <a href="http://academy.telerik.com" class="signature-link">http://academy.telerik.com</a>
</div>


<!-- section start -->

<!-- attr: { class:'slide-title', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
# Table of Contents

- What are anonymous classes?
- Creating anonymous classes
- Using anonymous classes

<!-- section start -->

<!-- attr: {showInPresentation:true, hasScriptWrapper:true, style:'' } -->
# Anonymous Classes

- Anonymous classes allow developers to create classes inline:
  - I.e. implement an interface or extend a class
  - And immediately create instance of it

# Anonymous Classses Example:

- Having an interface

```java
public interface IRandomProvider {
	int Get();
}
```

- We can implement it and initialize object of it:

```java
IRandomProvider randomProvider = new IRandomProvider() {
  @Override
  public int Get() {
    return (int)(Math.random() * Integer.MAX_VALUE);
  }
};

int number = randomProvider.Get();
```

<!-- attr: {class: 'slide-section', style: 'font-size:40px'} -->
# Simple Anonymous Classes
##  [Demo](http://)

# More about anonymous classes

- With anonymous classes we can implement interfaces, extend classes
  - Pretty much use everything about OOP that we know
- Anonymous classes also have access to their scope

```java
int max = 5;
IRandomProvider randomProvider = new IRandomProvider() {
  @Override
  public int Get() {
    return (int)(Math.random() * max);
  }
};
```

<!-- attr: {class: 'slide-section'} -->
# Anonymous classes using the scope
##  [Demo](http://)

<!-- section start -->

<!-- attr: {class: 'slide-section'} -->
# Generics with Anonymous Classes

<!-- attr: {hasScriptWrapper: true} -->
# Generics with Anonymous Classes

- Anonymous classes are full normal classes
  - They can do everything another class can
- _Example:_ Anonymous classes with generics

```java
String[] values = {"JS", "Java", "C#", "Python", "PHP"};
IRandomValueProvider<String> provider =
  new IRandomValueProvider<String>(){
    @Override
    public String Get() {
      int index = (int)(Math.random() * values.length);
      return values[index];
    }
};
```

<!-- attr: {class: 'slide-section demo'} -->
# Anonymous Generic Classes
##  [Demo](http://)

<!-- section start -->

<!-- attr: {class: 'slide-section'} -->
# Uses of Anonymous classes
##  Why we need them?

# Uses of Anonymous Classes

- Anonymous classes are usable in very specific cases:
  - Handling events in Java.swing or Android
  - Unit Testing
    - For providing mock objects

<!-- attr: {class: 'slide-section'} -->
# Simple Unit Testing
##  [Demo](http://)

<!-- section start -->
<!-- attr: { id:'questions', class:'slide-section' } -->
# Questions
## Defining Classes
[link to Telerik Academy Forum](http://telerikacademy.com/Forum/Category/12/telerik-school-academy)

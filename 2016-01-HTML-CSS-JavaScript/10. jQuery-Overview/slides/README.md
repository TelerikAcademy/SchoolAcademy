<!-- section start -->
<!-- attr: { class:'slide-title', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
# jQuery Overview
##  Unleash the Power of jQuery
<div class="signature">
    <p class="signature-course">HTML, CSS & JavaScript</p>
    <p class="signature-initiative">Telerik School Academy</p>
    <a href="http://academy.telerik.com" class="signature-link">http://academy.telerik.com</a>
</div>

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# Table of Contents
- What is jQuery?
- jQuery Fundamentals
  - Selectors
  - DOM Manipulation
  - DOM Altering
  - jQuery DOM elements
  - jQuery Events
  - jQuery Chaining


<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
# What is jQuery?
##  The world’s most popular JavaScript library


<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# What is jQuery?
- jQuery is a cross-browser JavaScript library 
  - Designed to simplify the client-side scripting of HTML
  - The most popular JavaScript library in use today
  - Free, open source software
- jQuery's syntax is designed to make it easier to
  - Navigate a document and select DOM elements
  - Create animations
  - Handle events

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# What is jQuery? (2)
- jQuery also provides capabilities for developers to create plugins for
  - Low-level interaction and animation
  - Advanced effects and high-level, theme-able widgets
  - Creation of powerful and dynamic web pages
- Microsoft adopted jQuery within Visual Studio
  - Uses in Microsoft's ASP.NET AJAX Framework and ASP.NET MVC Framework

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# Why jQuery is So Popular?
- Easy to learn
  - Fluent programming style
- Easy to extend
  - You create new jQuery plugins by creating new JavaScript functions
- Powerful DOM Selection
  - Powered by CSS 3.0
- Lightweight
- Community Support
  - Large community of developers and geeks

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# How to Add jQuery to a Web Site?
- Download jQuery files from
  - [http://www.jquery.com](http://www.jquery.com)
- Self hosted
  - You can choose to self host the `.js` file
  - E.g. `jquery-2.1.1.js` or `.min.js `file
- Use it from CDN (content delivery network)
  - Microsoft, jQuery, Google CDNs
  - e.g. [http://code.jquery.com/jquery-2.1.1.min.js](http://code.jquery.com/jquery-2.1.1.min.js),
  - [http://ajax.microsoft.com/ajax/jquery/jquery-2.1.1.min.js](http://ajax.microsoft.com/ajax/jquery/jquery-2.1.1.min.js)

<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
# Selectors and DOM Manipulation

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# Selectors
- Selection of DOM elements in jQuery is much like as in pure JavaScript
  - Selection of elements using CSS selectors

```jquery
$(selector)
```
  - Like querySelectorAll

```jquery
//by tag
$("div") //document.querySelectorAll("div");
//by class
$(".menu-item")
//document.querySelectorAll(".menu-item");
//by id
$("#navigation")
//by combination of selectors
$("ul.menu li")
```

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# Selection with jQuery
- Selecting items with jQuery
  - Almost always returns a collection of the items
    - Even if there is only one item
  - Can be stored in a variable or used right away
  - The usage of the elements is always the same, no matter whether a single or many elements

  ```jquery
  // select the item
  $("#something").hide();
  $(".widgets").fade(1);
  ```
- More at: [http://learn.jquery.com/using-jquery-core/selecting-elements/](http://learn.jquery.com/using-jquery-core/selecting-elements/)

<!-- attr: { class:'slide-section demo', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
<!-- # Selection with jQuery -->
##  [Demo]()


<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, style:'' } -->
# DOM Traversal
##  Traversing the nodes of the DOM

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# DOM Traversal
- As with plain JavaScript, the DOM can be traversed with jQuery
  - Properties for:
    - Next and previous siblings
    - Parents and children

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# DOM Traversal:Next and Previous
- jQuery.next(), jQuery.prev()
  - Returns the next/prev sibling
  - Returns an HTML element
    - Not a [text] node

```html
<ul>
  <li>Item 1</li>
  <li>Item 2</li>
  <li>Item 3</li>
</ul>
```
```jquery
var $first = $("li").first();
log($first);
//logs "Item 1"
log($first.next());
//logs "Item 2"
```

<!-- attr: { class:'slide-section demo', showInPresentation:true, style:'' } -->
<!-- # Next/Prev Siblings -->
##  [Demo]()

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 38px' } -->
# DOM Traversal:Parent
- jQuery.parent()
  - Returns the parent of the element
- jQuery.parents(selector)
  - Returns the first parent that matches the selector

```html
<div id="wrapper">
 <ul id="items-list">
  <li>Item 1</li>
  <li>Item 2</li>
  <li class="special">Item 3</li>
  <li>Item 4</li>
 </ul>
</div>
```

```jquery
var $node = $(".special");
$node.parent().attr("id"); //logs "items-list"
$node.parents("div").attr("id");
//logs "wrapper"
$node.parents("#wrapper")     .attr("id");
/logs "wrapper"
```

<!-- attr: { class:'slide-section demo', showInPresentation:true, style:'' } -->
<!-- # Parent Element -->
##  [Demo]()

<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, style:'' } -->
# Altering the DOM
##  Adding and removing DOM elements

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->

# Adding Elements
- Adding elements can
  -  be done on the fly
  - `jQuery.appendTo()`/`prependTo()`
  - `jQuery.append()`/`prepend()`

```jquery
$('<ul><li>Hello</li></ul>').appendTo('body');
$("body").prepend("<h1>header</h1>");
```


<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# Creating elements
- Creating new elements is also easy

```jquery
var $divElement = $('<div>');
var $anotherDivElement = $('<div />');
```


<!-- attr: { class:'slide-section demo', showInPresentation:true, style:'' } -->
<!-- # Adding Elements to the DOM -->
##  [Demo]()

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# Removing Elements
- You can also remove elements from the DOM
  - Just as easy

```html  
// Before
<div>
  <p>Red</p>
  <p>Green</p>
</div>
```

```jquery
// Removing elements
$('p').remove();
```

```html
// After
<div>
</div>
```

<!-- attr: { class:'slide-section demo', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
<!-- # Removing Elements -->
##  [Demo]()


<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, style:'' } -->
# jQuery Extended DOM Elements

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# jQuery Objects
- Selected with jQuery DOM elements are NOT pure DOM elements
  - They are extended
  - Have additional properties and methods
    - `addClass()`, `removeClass()`, `toogleClass()`
    - `on(event, callback)` for attaching events
    - animate(), fade(), etc…

```jquery
//Parsing a regular DOM element to jQuery Element
var content = document.createElement("div");
var $content = $(content);
```

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# Properties of jQuery Elements
- jQuery elements extend regular DOM elements
- Methods for altering the elements
  - `jQuery.css("color", "#f3f")`
  - `jQuery.html()` returns the innerHTML
    - `jQuery.html(content)` sets the innerHTML
  - `jQuery.text(content)` sets the innerHTML, by escaping the content

<!-- attr: { class:'slide-section demo', showInPresentation:true, style:'' } -->
<!-- # Properties of jQuery Elements -->
##  [Demo]()

<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, style:'' } -->
# jQuery Events
##  Cross-browser events

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# jQuery Events
- jQuery has a convenient way for attaching and detaching events
  - Works cross-browser
  - Using methods `on()` and `off()`

```js
function onButtonClick(){
  $(".selected").removeClass("selected");
  $(this).addClass("selected");
}
$("a.button").on("click", onButtonClick);
```

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# jQuery Events
- Optimize the event
  - Add it on the parent element
  - A bit different syntax

```js
function onListItemClick(){
  $(".selected").removeClass("selected");
  $(this).addClass("selected");
}
$("ul").on("click", "li", onListItemClick);
```

<!-- attr: { class:'slide-section demo', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
<!-- # jQuery Event Handlers -->
##  [Demo]()


<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, style:'' } -->
# jQuery Chaining
##  Call after call, after call… Like an angry girlfriend

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# jQuery Chaining
- The chaining paradigm is as follows:
  - If a method should return result -> Ok, return it
  - If a method should NOT return a result -> return `this`
- jQuery implements this paradigm, so methods can be chained to one another:

```js
$('<button />')
  .addClass('btn-success')
  .html('Click me for success')
  .on('click', onSuccessButtonClick)
  .appendTo(document.body);
```

<!-- attr: { class:'slide-section demo', showInPresentation:true, style:'' } -->
<!-- # jQuery Chaining -->
##  [Demo]()

<!-- attr: { class:'slide-section', showInPresentation: true } -->
<!-- # Questions
##  jQuery Overview -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# Homework
`1.` Create a slider control using jQuery
  - The slider can have many slides
  - Only one slide is visible at a time
  - Each slide contains HTML code
    - i.e. it can contain images, forms, divs, headers, links, etc…
  - Implement functionality for changing the visible slide after 5 seconds
  - Create buttons for next and previous slide

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 38px' } -->
# Homework (2)
`2.` Using jQuery implement functionality to insert a DOM element before or after another element

`3.` By given an array of students, generate a table that represents these students
  - Each student has first name,last name and grade
  - Use jQuery

`4.` Implement functionality to change the background color of a web page
  - i.e. select a color from a color picker and set this color as the background color of the page

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# Homework (3)
`5.*` Implement a GridView control
  - Rows can be added dynamically
  - A header row can be added dynamically
    - Each GridView can have at most one header row
  - Each row can have  a nested GridView
    - Each GridView can have at most one nested GridView

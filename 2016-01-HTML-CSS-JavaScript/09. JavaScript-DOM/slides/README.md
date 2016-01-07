<!-- section start -->
<!-- attr: { class:'slide-title', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
# JavaScript DOM
##  Creating dynamic pages
<div class="signature">
    <p class="signature-course">HTML, CSS & JavaScript</p>
    <p class="signature-initiative">Telerik School Academy</p>
    <a href="http://academy.telerik.com" class="signature-link">http://academy.telerik.com</a>
</div>


<!-- section start -->
<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# Table of Contents
- DOM
- DOM Manipulation
- DOM Event model
    - Common DOM Events

<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
<!-- # Document Object Model (DOM) -->


<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# Document Object Model (DOM)
- Every HTML element is accessible via the JavaScript DOM API
- Most DOM objects can be manipulated by the programmer
- The event model lets a document to react when the user does something on the page
- Advantages
  - Create interactive pages
  - Updates the objects of a page without reloading it

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# Accessing Elements
- Access elements via their ID attribute

```html
var elem = document.getElementById("some-id")
```
- Via the name attribute


```html
var arr = document.getElementsByName("some-name")
```
- Via tag name

```html
var imgTags = el.getElementsByTagName("img")
```
  - Returns array of descendant `<img>` elements of the element "`el`"


<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# DOM Manipulation
- Once we access an element, we can read and write its attributes

```html
function change(state) {
  var lampImg = document.getElementById("lamp");
  lampImg.src = "lamp_" + state + ".png";
  var statusDiv =
    document.getElementById("statusDiv");
  statusDiv.innerHTML = "The lamp is " + state;
}
…
<img src="test_on.gif" onmouseover="change('off')"
  onmouseout="change('on')" />
```

<!-- attr: { class:'slide-section demo', showInPresentation:true, style:'' } -->
<!-- # DOM Manipulations -->
##  [Demo]()

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# Common Element Properties
- Most of the properties are derived from the HTML attributes of the tag
  - E.g. `id`, `name`, `href`, `alt`, `title`, `src`, etc…
- `style` property – allows modifying the CSS styles of the element
  - Corresponds to the inline style of the element
    - Not the properties derived from embedded or external CSS rules
  - Example: `style.width`, `style.marginTop`, `style.backgroundImage`

<!-- attr: { class:'slide-section demo', showInPresentation:true, style:'' } -->
<!-- # Changing the Style of an Element -->
##  [Demo]()

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# Common Element Properties (2)
- `className` – the `class` attribute of the tag
- `innerHTML` – holds all the entire HTML code inside the element
- Read-only properties with information for the current element and its state
  - `tagName`, `offsetWidth`, `offsetHeight`, `scrollHeight`,` scrollTop`, `nodeType`, etc…


<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->

# Accessing Elements through the DOM Tree Structure
- We can access elements in the DOM through some tree manipulation properties:
  - `element.childNodes`
  - `element.parentNode`
  - `element.nextSibling`
  - `element.previousSibling`
  - `element.firstChild`
  - `element.lastChild`

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# Accessing Elements through the DOM Tree – Example

```html
var el = document.getElementById('div-tag');
alert (el.childNodes[0].value);
alert (el.childNodes[1].
  getElementsByTagName('span').id);
…
<div id="div-tag">
  <input type="text" value="test text" />
  <div>
    <span id="test">test span</span>
  </div>
</div>
```
  - Warning: may not return what you expected due to Browser differences

<!-- attr: { class:'slide-section demo', showInPresentation:true, style:'' } -->
<!-- # Traversing the DOM -->
##  [Demo]()

<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, hasScriptWrapper:true, style:'' } -->
<!-- # The HTML DOM Event Model -->


<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# The HTML DOM Event Model
- JavaScript can register event handlers
  - Events are fired by the Browser and are sent to the specified JavaScript event handler function
  - Can be set with HTML attributes:

```html
<img src="test.gif" onclick="imageClicked()" />
```
  - Can be accessed through the DOM:

```html
var img = document.getElementById("myImage");
img.addEventListener("click", imageClicked);
```

<!-- attr: { class:'slide-section demo', showInPresentation:true, style:'' } -->
<!-- # On Click Event Listener -->
##  [Demo]()

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# The HTML DOM Event Model (2)
- All event handlers receive one parameter
  - It brings information about the event
  - Contains the type of the event (mouse click, key press, etc.)
  - Data about the location where the event has been fired (e.g. mouse coordinates)
  - Holds a reference to the event sender
    - E.g. the button that was clicked

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# The HTML DOM Event Model (3)
  - Holds information about the state of [Alt], [Ctrl] and [Shift] keys
  - Some browsers do not send this object, but place it in the `document.event`
  - Some of the names of the event’s object properties are browser-specific


<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# Common DOM Events
- Mouse events:
  - `onclick`, `onmousedown`, `onmouseup`
  - `onmouseover`, `onmouseout`, `onmousemove`
- Key events:
  - `onkeypress`, `onkeydown`, `onkeyup`
  - Only for input fields
- Interface events:
  - `onblur`, `onfocus`
  - `onscroll`

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# Common DOM Events (2)
- Form events
  - `onchange` – for input fields
  - `onsubmit`
    - Allows you  to cancel a form submission
    - Useful for form validation
- Miscellaneous events
  - `onload`, `onunload`
    - Allowed only for the `<body>` element
    - Fires when all content on the page was loaded / unloaded

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size: 40px' } -->
# onload Event – Example
- `onload` event

```html
<html>
<head>
  <script type="text/javascript">
    function greet() {
      alert('Loaded!');
    }
  < /script>
</head> 
<body onload="greet()" >
</body>
</html>
```

<!-- attr: { class:'slide-section demo', showInPresentation:true, style:'' } -->
<!-- # On Loaded Event Listener -->
##  [Demo]()

<!-- attr: { class:'slide-section', showInPresentation: true } -->
<!-- # Questions
##  JavaScript Fundamentals -->

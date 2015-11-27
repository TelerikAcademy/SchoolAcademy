Homework: Polymorphism
===================================

### Problem 1. Shapes
*	Define `abstract` class `Shape` with only one `abstract` method `calculateSurface()` and fields `width` and `height`.
*	Define two new classes `Triangle` and `Rectangle` that implement the `abstract` method and return the surface of the figure (height * width for rectangle and height * width/2 for triangle).
*	Define class `Square` and suitable constructor so that at initialization `height` **must** be kept equal to `width` and implement the `calculateSurface()` method.
* 	Test the behaviour of the `calculateSurface()` method for different shapes (`Square`, `Rectangle`, `Triangle`) stored in an array.

### Problem 2. Computer store
*	Define interface `IComputer` with only one method `compute()` and field `bits` that can be either `32` or `64`.
	*	Define class `Laptop` that is always 64 bits.
	*	Define class `SmartPhone` that is always 32 bits.
*	Both classes implement the `compute()` method from `IComputer`, that returns as a string the computer's bits, multiplied by a random number between 100 and 200, and converted to `binary`.
*	Initialize a list of 5 laptops and 5 smart phones and print the result from their  `.compute()` method.

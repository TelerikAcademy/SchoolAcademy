Homework: Generic methods
===================================

### Problem 1. Generic class
*	Write a generic class `CustomList<T>` that keeps a list of elements of some parametric type `T`.
*	Keep the elements of the list in an array with fixed capacity which is given as parameter in the class constructor.
*	Implement methods for `adding` element, `accessing` element by index, `removing` element by index, `inserting` element at given position, `clearing` the list, `finding` element by its value and override `ToString()`.
*	Check all input parameters to avoid accessing elements at invalid positions.

### Problem 2. Min and Max
*	Create generic methods `Min<T>()` and `Max<T>()` for finding the minimal and maximal element in the `CustomList<T>`.
*	You may need to add a generic constraints for the type `T`.

### Problem 3. Auto-grow
*	Implement auto-grow functionality: when the internal array is 75% full, create a new array of double size and move all elements to it.
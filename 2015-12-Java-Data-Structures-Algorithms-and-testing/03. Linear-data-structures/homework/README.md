## Linear Data Structures Homework

1. Write a program that reads from the console a sequence of positive integer numbers.
  - The sequence ends when empty line is entered.
  - Calculate and print the sum and average of the elements of the sequence.
  - Keep the sequence in `ArrayList<int>`.

2. Write a program that reads N integers from the console and reverses them using a stack.
  - Use the `Stack<int>` class.

3. Write a program that reads a sequence of integers (`ArrayList<int>`) ending with an empty line and sorts them in an increasing order.

4. Write a program that removes from given sequence all negative numbers.
 
5.* Write a program that finds in given array of integers (all belonging to the range [0..1000]) how many times each of them occurs.
  - Example: `array = {3, 4, 4, 2, 3, 3, 4, 3, 2}`
    - 2 &rarr; 2 times
    - 3 &rarr; 4 times
    - 4 &rarr; 3 times

6. Implement the data structure linked list.
  - Define a class `ListItem<T>` that has two fields: `value` (of type `T`) and `NextItem` (of type `ListItem<T>`). 
  - Define additionally a class `LinkedList<T>` with a single field `FirstElement` (of type `ListItem<T>`).

7.* Implement the ADT `stack` as auto-resizable array.
  - Resize the capacity on demand (when no space is available to add / insert a new element).

8.* Implement the ADT `queue` as dynamic linked list.
  - Use generics (`LinkedQueue<T>`) to allow storing different data types in the queue.


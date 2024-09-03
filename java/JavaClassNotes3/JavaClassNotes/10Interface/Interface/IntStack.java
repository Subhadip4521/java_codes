/*
Applying Interfaces
To understand the power of interfaces, let’s look at a more practical example. In earlier
chapters, you developed a class called Stack that implemented a simple fixed-size stack.
However, there are many ways to implement a stack. For example, the stack can be of a
fixed size or it can be “growable.” The stack can also be held in an array, a linked list, a
binary tree, and so on. No matter how the stack is implemented, the interface to the stack
remains the same. That is, the methods push( ) and pop( ) define the interface to the stack
independently of the details of the implementation. Because the interface to a stack is
separate from its implementation, it is easy to define a stack interface, leaving it to each
implementation to define the specifics. Let’s look at two examples.
First, here is the interface that defines an integer stack. Put this in a file called IntStack.java.
This interface will be used by both stack implementations.
*/
// Define an integer stack interface.
interface IntStack {
void push(int item); // store an item
int pop(); // retrieve an item
}

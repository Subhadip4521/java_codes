/*
Abstract class:
For any java class if we are not allow to create an object such type of class we have to 
declare with abstract modifier that is for abstract class instantiation is not possible.

abstract class Test
{
public static void main(String args[])
{
Test t=new Test();
}
}
Output:
Compile time error.
D:\Java>javac Test.java
Test.java:4: Test is abstract; cannot be instantiated
Test t=new Test();

What is the difference between abstract class and abstract method ? 
 If a class contain at least on abstract method then compulsory the corresponding 
class should be declare with abstract modifier. Because implementation is not 
complete and hence we can't create object of that class.
 Even though class doesn't contain any abstract methods still we can declare the 
class as abstract that is an abstract class can contain zero no of abstract methods 
also.
Example1: HttpServlet class is abstract but it doesn't contain any abstract method. 
Example2: Every adapter class is abstract but it doesn't contain any abstract method. 

Example1: 
class Parent
{
public void methodOne();
}
Output:
Compile time error.
D:\Java>javac Parent.java
Parent.java:3: missing method body, or declare abstract
public void methodOne();

Example2: 
class Parent
{
public abstract void methodOne(){}
}
Output:
Compile time error.
Parent.java:3: abstract methods cannot have a body
public abstract void methodOne(){}

Example3: 
class Parent
{
public abstract void methodOne();
}
Output:
Compile time error.
D:\Java>javac Parent.java
Parent.java:1: Parent is not abstract and does not
override abstract method methodOne() in Parent
class Parent

If a class extends any abstract class then compulsory we should provide implementation 
for every abstract method of the parent class otherwise we have to declare child class as 
abstract.

Example: 
abstract class Parent
{
public abstract void methodOne();
public abstract void methodTwo();
}
class child extends Parent
{
public void methodOne(){}
}
Output:
Compile time error.
D:\Java>javac Parent.java
Parent.java:6: child is not abstract and does not 
override abstract method methodTwo() in Parent
class child extends Parent

If we declare class child as abstract then the code compiles fine but child of child is 
responsible to provide implementation for methodTwo()

What is the difference between final and abstract ? 
 For abstract methods compulsory we should override in the child class to 
provide implementation. Whereas for final methods we can't override hence 
abstract final combination is illegal for methods.
 For abstract classes we should compulsory create child class to provide 
implementation whereas for final class we can't create child class. Hence final 
abstract combination is illegal for classes.
Final class cannot contain abstract methods whereas abstract class can contain 
final method

We can't create object for abstract class but abstract class can contain 
constructor what is the need ? 
abstract class constructor will be executed when ever we are creating child class object 
to perform initialization of child object. 
Example: 
class Parent{
Parent()
{
System.out.println(this.hashCode());
}
}
class child extends Parent{
child(){
System.out.println(this.hashCode());
}
}
class Test{
public static void main(String args[]){
child c=new child();
System.out.println(c.hashCode());
}
}
Note : We can't create object for abstract class either directly or indirectly. 
Every method present inside interface is abstract but in abstract class also we 
can take only abstract methods then what is the need of interface concept ? 
We can replace interface concept with abstract class. But it is not a good programming 
practice. We are misusing the roll of abstract class. It may create performence problems 
also.
(this is just like recruiting IAS officer for sweeping purpose) 


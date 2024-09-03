 /*
Dynamic method dispatch is the mechanism
by which a call to an overridden method is resolved at run time, rather than compile time.
Dynamic method dispatch is important because this is how Java implements run-time
polymorphism.
Let’s begin by restating an important principle: a superclass reference variable can refer
to a subclass object. Java uses this fact to resolve calls to overridden methods at run time. Here
is how. When an overridden method is called through a superclass reference, Java determines
which version of that method to execute based upon the type of the object being referred
to at the time the call occurs. Thus, this determination is made at run time. When different
types of objects are referred to, different versions of an overridden method will be called.
In other words, it is the type of the object being referred to (not the type of the reference variable)
that determines which version of an overridden method will be executed. Therefore, if a
superclass contains a method that is overridden by a subclass, then when different types
of objects are referred to through a superclass reference variable, different versions of the
method are executed.
Here is an example that illustrates dynamic method dispatch:*/
// Dynamic Method Dispatch

class A 
{
void callme() 
{
System.out.println("Inside A's callme method");
}
}
class B extends A 
{
// override callme()
void callme() 
{
System.out.println("Inside B's callme method");
}
}
class C extends A 
{
// override callme()
void callme() 
{
System.out.println("Inside C's callme method");
}
}

class Dispatch 
{
public static void main(String args[]) 
{
A a = new A(); // object of type A
B b = new B(); // object of type B
C c = new C(); // object of type C
A r; // obtain a reference of type A
r = a; // r refers to an A object
r.callme(); // calls A's version of callme
 of type A, called r, is declared. The program
then in turn assigns a reference to each type of object to r and uses that reference to invoke
callme( ). As the output shows, the version of callme( ) executed is determined by the type
of object being referred to at the time of the call. Had it been determined by the type of the
reference variable, r, you would see three calls to A’s callme( ) method.*/
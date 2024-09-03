/*In the program, an inner class named Inner is defined within the scope of class Outer.
Therefore, any code in class Inner can directly access the variable outer_x. An instance
method named display( ) is defined inside Inner. This method displays outer_x on the
standard output stream. The main( ) method of InnerClassDemo creates an instance of
class Outer and invokes its test( ) method. That method creates an instance of class Inner
and the display( ) method is called.
It is important to realize that an instance of Inner can be created only within the scope
of class Outer. The Java compiler generates an error message if any code outside of class
Outer attempts to instantiate class Inner. (In general, an inner class instance must be
created by an enclosing scope.) You can, however, create an instance of Inner outside of
Outer by qualifying its name with Outer, as in Outer.Inner.
As explained, an inner class has access to all of the members of its enclosing class, but
the reverse is not true. Members of the inner class are known only within the scope of the
inner class and may not be used by the outer class. For example,
// This program will not compile.*/
class Outer {
int outer_x = 100;
void test() {
Inner inner = new Inner();
inner.display();
}
// this is an inner class
class Inner {
int y = 10; // y is local to Inner
void display() {
System.out.println("display: outer_x = " + outer_x);
}
}
void showy() {
System.out.println(y); // error, y not known here!
}
}
class InnerClassDemo1 {
public static void main(String args[]) {
Outer outer = new Outer();
outer.test();
}
}
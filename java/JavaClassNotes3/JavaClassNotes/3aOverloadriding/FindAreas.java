/*
Applying Method Overriding
Let’s look at a more practical example that uses method overriding. The following program
creates a superclass called Figure that stores the dimensions of a two-dimensional object. It
also defines a method called area( ) that computes the area of an object. The program derives
two subclasses from Figure. The first is Rectangle and the second is Triangle. Each of
these subclasses overrides area( ) so that it returns the area of a rectangle and a triangle,
respectively.*/
// Using run-time polymorphism.

class Figure 
{
double dim1;
double dim2;
Figure(double a, double b) {
dim1 = a;
dim2 = b;
}
double area() {
System.out.println("Area for Figure is undefined.");
return 0;
}
}
class Rectangle extends Figure {
Rectangle(double a, double b) {
super(a, b);
}
// override area for rectangle
double area() {
System.out.println("Inside Area for Rectangle.");
return dim1 * dim2;
}
}
class Triangle extends Figure {
Triangle(double a, double b) {
super(a, b);
}
// override area for right triangle
double area() {
System.out.println("Inside Area for Triangle.");
return dim1 * dim2 / 2;
}
}
class FindAreas {
public static void main(String args[]) {
Figure f = new Figure(10, 10);
Rectangle r = new Rectangle(9, 5);
Triangle t = new Triangle(10, 8);
Figure figref;
figref = r;
System.out.println("Area is " + figref.area());
figref = t;
System.out.println("Area is " + figref.area());
figref = f;
System.out.println("Area is " + figref.area());
}
}

/*The output from the program is shown here:
Inside Area for Rectangle.
Area is 45
Inside Area for Triangle.
Area is 40
Area for Figure is undefined.
Area is 0
Through the dual mechanisms of inheritance and run-time polymorphism, it is possible
to define one consistent interface that is used by several different, yet related, types of objects.
In this case, if an object is derived from Figure, then its area can be obtained by calling area( ).
The interface to this operation is the same no matter what type of figure is being used.*/
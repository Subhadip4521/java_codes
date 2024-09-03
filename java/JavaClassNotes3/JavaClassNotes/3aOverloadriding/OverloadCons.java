/*
Overloading Constructors
In addition to overloading normal methods, you can also overload constructor methods. In
fact, for most real-world classes that you create, overloaded constructors will be the norm,
not the exception. To understand why, let’s return to the Box class developed in the preceding
chapter. Following is the latest version of Box:

class Box 
{
double width;
double height;
double depth;
// This is the constructor for Box.
Box(double w, double h, double d) 
{
width = w;
height = h;
depth = d;
}
// compute and return volume
double volume() 
{
return width * height * depth;
}
}
As you can see, the Box( ) constructor requires three parameters. This means that all
declarations of Box objects must pass three arguments to the Box( ) constructor. For example,
the following statement is currently invalid:
Box ob = new Box();
Since Box( ) requires three arguments, it’s an error to call it without them. This raises
some important questions. What if you simply wanted a box and did not care (or know)
what its initial dimensions were? Or, what if you want to be able to initialize a cube by
specifying only one value that would be used for all three dimensions? As the Box class
is currently written, these other options are not available to you.
Fortunately, the solution to these problems is quite easy: simply overload the Box
constructor so that it handles the situations just described. Here is a program that contains
an improved version of Box that does just that:
 Here, Box defines three constructors to initialize
the dimensions of a box various ways.
*/

class Box 
{
double width;
double height;
double depth;
// constructor used when all dimensions specified
Box(double w, double h, double d) 
{
width = w;
height = h;
depth = d;
}
// constructor used when no dimensions specified
Box() 
{
width = -1; // use -1 to indicate
height = -1; // an uninitialized
depth = -1; // box
}
// constructor used when cube is created
Box(double len) 
{
width = height = depth = len;
}
// compute and return volume
double volume() 
{
return width * height * depth;
}
}


class OverloadCons 
{
public static void main(String args[]) 
{
// create boxes using the various constructors
Box mybox1 = new Box(10, 20, 15);
Box mybox2 = new Box();
Box mycube = new Box(7);
double vol;
// get volume of first box
vol = mybox1.volume();
System.out.println("Volume of mybox1 is " + vol);
// get volume of second box
vol = mybox2.volume();
System.out.println("Volume of mybox2 is " + vol);
// get volume of cube
vol = mycube.volume();
System.out.println("Volume of mycube is " + vol);
}
}
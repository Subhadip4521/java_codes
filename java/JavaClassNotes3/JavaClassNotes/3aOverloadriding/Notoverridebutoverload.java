/*Method overriding occurs only when the names and the type signatures of the two
methods are identical. If they are not, then the two methods are simply overloaded. For
example, consider this modified version of the preceding example:*/
// Methods with differing type signatures are overloaded – not overridden.

class A 
{
int i, j;
A(int a, int b) 
{
i = a;
j = b;
}
// display i and j
void show() 
{
System.out.println("i and j: " + i + " " + j);
}
}
// Create a subclass by extending class A.
class B extends A 
{
int k;
B(int a, int b, int c) 
{
super(a, b);
k = c;
}
// overload show()
void show(String msg) 
{
System.out.println(msg + k);
}
}
class Notoverridebutoverload {
public static void main(String args[]) 
{
B subOb = new B(1, 2, 3);
subOb.show("This is k: "); // this calls show() in B
subOb.show(); // this calls show() in A
}
}

/*The output produced by this program is shown here:
This is k: 3
i and j: 1 2
The version of show( ) in B takes a string parameter. This makes its type signature
different from the one in A, which takes no parameters. Therefore, no overriding (or name
hiding) takes place. Instead, the version of show( ) in B simply overloads the version of
show( ) in A.*/
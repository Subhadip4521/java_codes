/*In a class hierarchy, when a method in a subclass has the same name and type signature as
a method in its superclass, then the method in the subclass is said to override the method in
the superclass. When an overridden method is called from within a subclass, it will always
refer to the version of that method defined by the subclass. The version of the method defined
by the superclass will be hidden. Consider the following:*/
// Method overriding.
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

class B extends A 
{
int k;
B(int a, int b, int c) 
{
super(a, b);
k = c;
}
// display k – this overrides show() in A
void show() 
{
System.out.println("k: " + k);
}
}

class Override 
{
public static void main(String args[]) 
{
B subOb = new B(1, 2, 3);
subOb.show(); // this calls show() in B
}
}
/*
When show( ) is invoked on an object of type B, the version of show( ) defined within B
is used. That is, the version of show( ) inside B overrides the version declared in A.*/
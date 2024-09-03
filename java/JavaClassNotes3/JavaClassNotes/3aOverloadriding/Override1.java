// Method overriding.
/*If you wish to access the superclass version of an overridden method, you can do so by
using super. For example, in this version of B, the superclass version of show( ) is invoked
within the subclass’ version. This allows all instance variables to be displayed.*/
class A {
int i, j;
A(int a, int b) {
i = a;
j = b;
}
// display i and j
void show() {
System.out.println("i and j: " + i + " " + j);
}
}
class B extends A {
int k;
B(int a, int b, int c) {
super(a, b);
k = c;
}
void show() {
super.show(); // this calls A's show()
System.out.println("k: " + k);
}
}
class Override1 {
public static void main(String args[]) {
B subOb = new B(1, 2, 3);
subOb.show(); // this calls show() in B
}
}
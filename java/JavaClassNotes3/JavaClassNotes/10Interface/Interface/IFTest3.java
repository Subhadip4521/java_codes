/*The following class uses both the FixedStack and DynStack implementations. It does
so through an interface reference. This means that calls to push( ) and pop( ) are resolved
at run time rather than at compile time.
 Create an interface variable and access stacks through it.
*/
class IFTest3 {
public static void main(String args[]) {
IntStack mystack; // create an interface reference variable
DynStack ds = new DynStack(5);
FixedStack fs = new FixedStack(8);
mystack = ds; // load dynamic stack
// push some numbers onto the stack
for(int i=0; i<12; i++) mystack.push(i);
mystack = fs; // load fixed stack
for(int i=0; i<8; i++) mystack.push(i);
mystack = ds;
System.out.println("Values in dynamic stack:");
for(int i=0; i<12; i++)
System.out.println(mystack.pop());
mystack = fs;
System.out.println("Values in fixed stack:");
for(int i=0; i<8; i++)
System.out.println(mystack.pop());
}
}
/*In this program, mystack is a reference to the IntStack interface. Thus, when it refers to ds,
it uses the versions of push( ) and pop( ) defined by the DynStack implementation. When it
refers to fs, it uses the versions of push( ) and pop( ) defined by FixedStack. As explained,
these determinations are made at run time. Accessing multiple implementations of an interface
through an interface reference variable is the most powerful way that Java achieves run-time
polymorphism.*/
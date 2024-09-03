/*Super at method level
Whenever we inherit the base class methods into the derived class, there is a possibility that
base class methods are similar to derived methods.
To differentiate the base class methods with derived class methods in the derived class, the
base class methods must be preceded by a keyword super.
Syntax for super at method level: super. base class method name. */

class Bc
	{
	void display ()
		{
		System.out.println ("BASE CLASS - DISPLAY...");
		}
	}

class Dc extends Bc
{
void display ()
{
super.display (); //refers to base class display method
System.out.println ("DERIVED CLASS - DISPLAY...");
}
}

class InDemo2
{
public static void main (String k [])
{
Dc do1=new Dc ();
do1.display ();
}
}
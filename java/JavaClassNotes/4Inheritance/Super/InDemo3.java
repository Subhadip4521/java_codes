//1. Whenever we want to call default constructor of base class from default constructor //of
//derived class using super () in default constructor of derived class is optional.
class Bc
{
Bc ()
{
System.out.println ("I AM FROM BASE CLASS...");
}
}
class Ibc extends Bc
{
Ibc ()
{
System.out.println ("I AM FROM INTERMEDIATE BASE CLASS...");
}
}
class Dc extends Ibc
{
Dc ()
{
//super (); //optional
System.out.println ("I AM FROM DERIVED CLASS...");
}
}
class InDemo3
{
public static void main (String k [])
{
Dc o1=new Dc ();
}
}
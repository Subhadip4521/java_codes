abstract class C1
{
abstract void f1 ();
abstract void f2 ();
}
abstract class C2 extends C1
{
void f1 ()
{
System.out.println("f1-C2-original");
}
}
class C3 extends C2
{
void f1 ()
{
super.f1 ();
System.out.println ("f1-C3-OVERRIDDEN");
}
void f2 ()
{
System.out.println ("f2-C3");
}
void f3 ()
{
System.out.println ("f3-C3-SPECIALLY DEFINED");
}
}
class AbDemo1
{
public static void main (String k [])
{
C3 o3=new C3 ();
o3.f1 ();
o3.f2 ();
o3.f3 ();
// C2 o2=new C2 (); invalid
C2 o2=new C3 ();
o2.f1 ();
o2.f2 ();
// o2.f3 (); invalid
C1 o1=new C3 (); // or o2
o1.f1 ();
o1.f2 ();
// o1.f3 ();
}
}
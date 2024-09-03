abstract class Op
{
abstract void sum ();
}
class isum extends Op
{
void sum ()
{
int a,b,c;
a=10;
b=20;
c=a+b;
System.out.println ("INT VALUE = "+c);
}
}
class fsum extends Op
{
void sum ()
{
float f1,f2,f3;
f1=10.26f;
f2=20.32f;
f3=f1+f2;
System.out.println ("FLOAT VALUE = "+f3);
}
}
class AbDemo
{
public static void main (String k [])
{
// Op o1=new Op (); invalid
Op o2;
o2=new isum ();
o2.sum ();
o2=new fsum ();
o2.sum ();
}
}
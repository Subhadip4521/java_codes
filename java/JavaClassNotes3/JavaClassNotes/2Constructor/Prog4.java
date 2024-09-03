class Test
{
int a, b;
Test ()
{
this (10); //calling current class single parameterized constructor
System.out.println ("I AM FROM DEFAULT CONSTRUCTOR...");
a=1;
b=2;
System.out.println ("VALUE OF a = "+a);
System.out.println ("VALUE OF b = "+b);
}
Test (int x)
{
this (100, 200); //calling current class double parameterized constructor
System.out.println ("I AM FROM SINGLE PARAMETERIZED CONSTRUCTOR...");
a=b=x;
System.out.println ("VALUE OF a = "+a);
System.out.println ("VALUE OF b = "+b);
}
Test (int a, int b)
{
System.out.println ("I AM FROM DEFAULT CONSTRUCTOR...");
this.a=a;
this.b=b;
this.a=23;
System.out.println ("VALUE OF a = "+this.a);
System.out.println ("VALUE OF b = "+this.b);
System.out.println ("VALUE OF a = "+a);
System.out.println ("VALUE OF b = "+b);
}
}
class Prog4
{
public static void main (String k [])
{
Test t1=new Test ();
}
}













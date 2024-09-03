//Write a JAVA program which illustrates the concept of default constructor, parameterized
//constructor and overloaded constructor?

class Test
{
int a, b,c;
Test ()
{
System.out.println ("I AM FROM DEFAULT CONSTRUCTOR...");
a=1;
b=2;
//c=a+b;
System.out.println ("VALUE OF a ="+a);
System.out.println ("VALUE OF b ="+b);
}
Test (int x, int y)
{
System.out.println ("I AM FROM DOUBLE PARAMETERIZED CONSTRUCTOR...");
a=x;
b=y;
System.out.println ("VALUE OF a ="+a);
System.out.println ("VALUE OF b ="+b);
}
Test (int x)
{
System.out.println ("I AM FROM SINGLE PARAMETERIZED CONSTRUCTOR...");
a=x;
b=x;
System.out.println ("VALUE OF a ="+a);
System.out.println ("VALUE OF b ="+b);
}
Test (Test T)
{
System.out.println ("I AM FROM OBJECT PARAMETERIZED CONSTRUCTOR...");
a=T.a;
b=T.b;
System.out.println ("VALUE OF a ="+a);
System.out.println ("VALUE OF b ="+b);
}
}
class Prog3
{
public static void main (String k [])
{
Test t1=new Test ();
Test t2=new Test (10, 20);
Test t3=new Test (1000);
Test t4=new Test (t1);
}
}
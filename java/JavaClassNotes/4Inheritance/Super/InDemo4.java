/* 2. Whenever we want to call the super class parameterized class from parameterized class of
the derived class using super (…) in parameterized class of derived class is mandatory.*/

class C1
{
int a;
C1 (int a)
{
System.out.println ("PARAMETERIZED CONSTRUCTOR - C1");
this.a=a;
System.out.println ("VALUE OF a = "+a);
}
}

class C2 extends C1
{
int b;
C2 (int a, int b)
{
super (a);
System.out.println ("PARAMETERIZED CONSTRUCTOR – C2");
this.b=b;
System.out.println ("VALUE OF b = "+b);
}
}

class InDemo4
{
public static void main (String k [])
{
C2 o2=new C2 (10, 20);
}
}
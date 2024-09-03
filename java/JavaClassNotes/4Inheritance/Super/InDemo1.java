//Syntax for super at VARIABLE LEVEL:
//   (super. base class member name)

class Bc
{
int a; 
}

class Dc extends Bc
{
int a; 
	void set (int x, int y) //method
	{
	super.a=x;
	a=y; 
	}
	void sum () //method
	{
	System.out.println ("SUM = "+(super.a-a)); 
	}
}

class InDemo1
{
public static void main (String k [])
{
int n1=Integer.parseInt (k[0]); 
int n2=Integer.parseInt (k[1]);  
Dc do1=new Dc ();
do1.set (n1, n2);
do1.sum ();
}
}
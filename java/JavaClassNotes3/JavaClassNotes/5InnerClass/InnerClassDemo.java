// Demonstrate an inner class.
class Outer 
{ 
int outer_x = 100;
	void test() 
	{
	Inner inner = new Inner();
	inner.display();
	}
// this is an inner class
		class Inner 
		{
			int inner_x=20;
			void display() 
			{
			System.out.println("display: outer_x = " + outer_x);
			}
		}
{
//System.out.println("display: inner_x = " + inner_x);
}
}
class InnerClassDemo 
{
public static void main(String args[]) 
{
Outer outer = new Outer();
outer.test();
}
}
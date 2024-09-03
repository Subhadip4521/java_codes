class Exc2 
{
	public static void main(String args[]) 
	{
	int d, a;
	try 
		{ // monitor a block of code.
		d = 0;
		a = 42 / d;
		System.out.println("This will not be 		printed.");
		} 
	catch (ArithmeticException e) 
		{ // catch divide-by-zero error
		System.out.println("Division by 		zero.");
		}
	System.out.println("After catch statement.");
	}
}
//Notice that the call to println( ) inside the try //block is never executed. Once an exception
//is thrown, program control transfers out of the try //block into the catch block.
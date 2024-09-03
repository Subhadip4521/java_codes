//creation of user defined unchecked exception using parameterised //constructor approach
import java .util.*;
class Test3 
{
	static void status(int age) 
	{
	if(age>18)
		{
		System.out.println("eligible for marrage");
		}
	else
	{
	throw new InvalidAgeException3("not eligible for marrage vvvvvvvv");
	}
}
public static void main(String args[]) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your age");
	int age=s.nextInt();
	Test3.status(age);
	}
}
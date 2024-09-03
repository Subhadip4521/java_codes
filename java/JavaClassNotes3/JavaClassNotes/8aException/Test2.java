//creation of user defined unchecked exception using default constructor approach
import java .util.*;
class Test2 
{
	static void status(int age) 
	{
	if(age>18)
		{
		System.out.println("eligible for marrage");
		}
	else
	{
	throw new InvalidAgeException2();
	}
}
public static void main(String args[]) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your age");
	int age=s.nextInt();
	Test2.status(age);
	}
}
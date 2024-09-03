//creation of user defined checked exception using parameterised constructor approach
import java .util.*;
class Test1 
{
	static void status(int age) throws InvalidAgeException1
	{
	if(age>18)
		{
		System.out.println("eligible for marrage");
		}
	else
	{
	throw new InvalidAgeException1("not eligible for marrage");
	}
}
public static void main(String args[]) throws InvalidAgeException1
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your age");
	int age=s.nextInt();
	Test1.status(age);
	}
}
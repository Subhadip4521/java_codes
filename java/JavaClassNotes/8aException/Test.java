//creation of user defined checked exception using default constructor approach
import java .util.*;
class Test 
{
	static void status(int age) throws InvalidAgeException
	{
	if(age>18)
		{
		System.out.println("eligible for marrage");
		}
	else
	{
	throw new InvalidAgeException();
	}
}
public static void main(String args[]) throws InvalidAgeException
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your age");
	int age=s.nextInt();
	Test.status(age);
	}
}

//satrajitdasbesu12@gmail.com
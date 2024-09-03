import java.io.*;
class Student
{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public int rollno;
	String name;
	String year;
	float m1,m2,m3,m4;
	public void getdata() throws IOException
	{
	rollno=Integer.parseInt(in.readLine());
	name=in.readLine();
	year=in.readLine();
	m1=Float.parseFloat(in.readLine());
	m2=Float.parseFloat(in.readLine());
	m3=Float.parseFloat(in.readLine());
	m4=Float.parseFloat(in.readLine());
	}
	public void display()
	{
	System.out.println("Roll no = " +rollno);
	System.out.println("Name = " +name);
	System.out.println("Year = " +year);
	System.out.println("marks = " +m1+"," +m2+"," +m3+"," +m4);
	}
	public void calc_result()
	{
	String result ="fail";
	if(m1 >= 40 && m2 >= 40 && m3 >= 40 && m4 >= 40)
		result ="pass";
	System.out.println("Result = " +result);
	}
}
public class StudentTest2
{
	public static void main(String args[])throws IOException
	{
	BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("how many students?:");
	int max=Integer.parseInt(in.readLine());
	Student s[] =new Student[max];
	for(int i=0;i<max;i++)
		s[i]= new Student();
	for(int i=0;i<max;i++)
	{
	System.out.println("Enter details of students" +i);
	s[i].getdata();
	}
	for(int i=0;i<max;i++)
	{
		System.out.println("Result of student "+i);
		s[i].display();
		s[i].calc_result();
	}
	}
}
	
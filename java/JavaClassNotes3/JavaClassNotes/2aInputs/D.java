//BufferedReader
import java.io.*;
class D
{
public static void main(String args[])throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter radius");
double rad=Double.parseDouble(in.readLine());
double area=3.14*rad*rad;
System.out.println("Area of the circle is "+area);
}
}

//DataInputStream
import java.io.*;
class E
{
public static void main(String args[]) throws IOException
{
DataInputStream in= new DataInputStream(System.in);
System.out.println("Enter rad");
int f=Integer.parseInt(in.readLine());
//double area=3.14*f*f;
System.out.println(f);
}
}
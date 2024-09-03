import java.io.*;
class F
{
public static void main(String args[]) throws IOException
{
Console c =System.console();
System.out.println("Enter user name");
String s=c.readLine();
System.out.println(s);
}
}
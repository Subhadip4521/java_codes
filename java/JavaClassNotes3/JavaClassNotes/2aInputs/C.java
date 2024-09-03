//Scanner Class
import java.util.*;
class C
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter integer 1");
int a=sc.nextInt();
System.out.println("Enter integer 2");
int b=sc.nextInt();
sc.nextLine();
System.out.println("Enter your name");
String name=sc.nextLine();
System.out.println("Hello"+name+"Sum is"+(a+b));
}
}

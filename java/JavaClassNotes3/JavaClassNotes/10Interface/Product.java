import java.util.Scanner;  
public class Product implements Cloneable   
{  
int pid;  
String pname;  
double pcost;  
//Product class constructor   
public Product (int pid, String pname, double pcost)  
{  
this.pid = pid;  
this.pname = pname;  
this.pcost = pcost;  
}  
//method that prints the detail on the console  
public void showDetail()   
{  
System.out.println("Product ID: "+pid);  
System.out.println("Product Name: "+pname);  
System.out.println("Product Cost: "+pcost);  
}  
public static void main (String args[]) throws CloneNotSupportedException   
{  
//reading values of the product from the user  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter product ID: ");  
int pid = sc.nextInt();  
System.out.print("Enter product name: ");  
String pname = sc.next();  
System.out.print("Enter product Cost: ");  
double pcost = sc.nextDouble();  
System.out.println("-------Product Detail--------");  
Product p1 = new Product(pid, pname, pcost);  
//cloning the object of the Product class using the clone() method  
Product p2 = (Product) p1.clone();  
//invoking the method to print detail  
p1.showDetail();
p2.showDetail();  
}  
}  
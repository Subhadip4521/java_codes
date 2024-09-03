/*
Clone () method:
1. The process of creating exactly duplicate object is called cloning. 
2. The main objective of cloning is to maintain backup purposes.(i.e., if something 
goes wrong we can recover the situation by using backup copy.) 
3. We can perform cloning by using clone() method of Object class.
protected native object clone() throws CloneNotSupportedException;
*/
class Test implements Cloneable
{
int i=10;
int j=20;
public static void main(String[] args)throws CloneNotSupportedException
{
Test t1=new Test();
Test t2=(Test)t1.clone();
t2.i=888;
t2.j=999;
System.out.println(t1.i+"---------------"+t1.j);
System.out.println(t2.i+"---------------"+t2.j);
}
}
/*
 We can perform cloning only for Cloneable objects.
 An object is said to be Cloneable if and only if the corresponding class 
implements Cloneable interface.
 Cloneable interface present in java.lang package and does not contain any 
methods. It is a marker interface where the required ability will be provided 
automatically by the JVM.
 If we are trying to perform cloning or non-clonable objects then we will get 
RuntimeException saying CloneNotSupportedException.
*/
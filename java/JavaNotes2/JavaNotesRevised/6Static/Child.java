// Instance control in parent to child relationship
class Parent
{
int i=10; //4   //15
{  //5
m1(); //16
System.out.println("Parent instance block");   //18
}
Parent()   //6
{
System.out.println("Constructor");    //20
}
public static void main(String args[])   //1
{
Parent p=new Parent();
System.out.println("Parent main");
}
public void m1()  //7
{
System.out.println(j);  //17
}
int j=20;   //8   //19
}

class Child extends Parent
{
int x=100;  //9  //21
{ //10
m2();  //22
System.out.println("CFIB");  //24
}
Child()  //11
{
System.out.println("Child Constructor");    //27
}
public static void main(String args[])   //2
{
System.out.println("Child main up"); //2a
Child c=new Child();    //3
System.out.println("Child main");  //28
}
public void m2()   //12
{
System.out.println(y);   //23
}
{  //13
System.out.println("CSIR"); //25
}
int y=200;  //14   //26
}
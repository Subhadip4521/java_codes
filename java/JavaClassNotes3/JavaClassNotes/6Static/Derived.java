class Base
{
static int i=10; //#1   #12
static //#2
{
m1();   //#13
System.out.println("Base Static Block");   //#15
}
public static void main(String args[]) //#3
{
m1();
System.out.println("Base main");
}
public static void m1() //#4
{
System.out.println(j);    //#14
}
static int j=20; //#5    #16
}
class Derived extends Base
{
static int x=100; //#6    #17
static //#7
{
m2();  // #18
System.out.println("Derived first static block");  // #20
}
public static void main(String args[])// #8
{
m2(); //  #23
System.out.println("Derived main");   // #25
}
public static void m2()// #9
{
System.out.println(y); //  #19     #24
}
static// #10
{
System.out.println("Derived second static block");  //  #21
}
static int y=200;// #11    #22
}


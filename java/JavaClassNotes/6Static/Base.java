class Base
{

static int i=10; //static variable //#1 #7

static //static block #2
{
m1(); //#8
System.out.println("First static block"); //10
}

public static void main(String args[])  //#3
{
m1();//#13
System.out.println("Main method"); //#15
}

public static void m1()   //#4
{
System.out.println(j); //#9  #14
}

static    //#5
{
System.out.println("Second static block"); //11
}

static int j=20;  //#6  #12

}


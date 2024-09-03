//Accessing inner class code from instance area of outer class: 
class Outerr3
{
class Innerr3
{
public void methodOne()
{
System.out.println("inner class method");
}
}
public void methodTwo()
{
Innerr3 i=new Innerr3();
i.methodOne();
}
public static void main(String[] args)
{
Outerr3 o=new Outerr3();
o.methodTwo();
}
}

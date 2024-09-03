//Accessing inner class code from outside of outer class:
class Outerr4
{
class Innerr4
{
public void methodOne()
{
System.out.println("inner class method");
}
}
}
class Test
{
public static void main(String[] args)
{
new Outerr4().new Innerr4().methodOne();
}
}
/*Method local inner classes:
 Sometimes we can declare a class inside a method such type of inner classes are 
called method local inner classes.
 The main objective of method local inner class is to define method specific 
repeatedly required functionality.
 Method Local inner classes are best suitable to meet nested method requirement.
 We can access method local inner class only within the method where we 
declared it. That is from outside of the method we can't access. As the scope of 
method local inner classes is very less, this type of inner classes are most rarely 
used type of inner classes.

Page 434

 If we are declaring inner class inside instance method then we can access both 
static and non static members of outer class directly.
 But if we are declaring inner class inside static method then we can access only 
static members of outer class directly and we can't access instance members 
directly. */

class Test1
{
int x=10;
static int y=20;
public void methodOne()
{
class Inner
{
public void methodTwo()
{
System.out.println(x);//10
System.out.println(y);//20
}
}
Inner i=new Inner();
i.methodTwo();
}
public static void main(String[] args)
{
new Test1().methodOne();
}
}


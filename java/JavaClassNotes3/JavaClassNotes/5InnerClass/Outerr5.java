//From inner class we can access all members of outer class (both static and nonstatic, 
//private and non private methods and variables) directly.
class Outerr5
{
int x=10;
static int y=20;

class Innerr5
{
public void methodOne()
{
System.out.println(x);//10
System.out.println(y);//20
}
}

public static void main(String[] args)
{
new Outerr5().new Innerr5().methodOne();
}
}

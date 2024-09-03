/*Within the inner class "this" always refers current inner class object. To refer 
current outer class object we have to use "outer class name.this".*/
class Outerr6
{
int x=10;
class Innerr6
{
int x=100;
public void methodOne()
{
int x=1000;
System.out.println(x);//1000
System.out.println(this.x);//100
System.out.println(Outerr6.this.x);//10
}
}
public static void main(String[] args)
{
new Outerr6().new Innerr6().methodOne();
}
}
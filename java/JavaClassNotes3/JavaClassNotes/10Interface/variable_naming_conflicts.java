Variable naming conflicts:
Two interfaces can contain a variable with the same name and there may be a chance 
variable naming conflicts but we can resolve variable naming conflicts by using 
interface names.
Example 1: 
interface Left
{
int x=888;
}
Example 2:
interface Right
{
int x=999;
}
Example 3: 
class Test implements Left,Right
{
public static void main(String args[]){
//System.out.println(x);
System.out.println(Left.x);
System.out.println(Right.x);
}
}
Output:
D:\Java>javac Left.java
D:\Java>javac Right.java
D:\Java>javac Test.java
D:\Java>java Test
888
999
Interface naming conflicts:
Method naming conflicts:
Case 1: 
If two interfaces contain a method with same signature and same return type in the 
implementation class only one method implementation is enough. Diamond problem solved.
Example 1: 
interface Left
{
public void methodOne();
}
Example 2: 
interface Right
{
public void methodOne();
}
Example 3: 
class Test implements Left,Right
{
public void methodOne()
{
}
}
Output:
D:\Java>javac Left.java
D:\Java>javac Right.java
D:\Java>javac Test.java
Case 2: 
if two interfaces contain a method with same name but different arguments in the 
implementation class we have to provide implementation for both methods and these 
methods acts as a overloaded methods

Example 1: 
interface Left
{
public void methodOne();
}
Example 2: 
interface Right
{
public void methodOne(int i);
}
Example 3: 
class Test implements Left,Right
{
public void methodOne()
{
}
public void methodOne(int i)
{
}}
Output:
D:\Java>javac Left.java
D:\Java>javac Right.java
D:\Java>javac Test.java

Case 3: 
If two interfaces contain a method with same signature but different return types then it 
is not possible to implement both interfaces simultaneously.
Example 1: 
interface Left
{
public void methodOne();
}
Example 2: 
interface Right
{
public int methodOne(int i);
}
We can't write any java class that implements both interfaces simultaneously.
Is a java class can implement any no. Of interfaces simultaneously ? 
Yes, except if two interfaces contains a method with same signature but different return 
types.


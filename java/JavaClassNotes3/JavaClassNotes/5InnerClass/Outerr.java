/*Sometimes we can declare a class inside another class such type of classes are 
called inner classes.
Sun people introduced inner classes in 1.1 version as part of "EventHandling" to 
resolve GUI bugs.
 But because of powerful features and benefits of inner classes slowly the 
programmers starts using in regular coding also.
 Without existing one type of object if there is no chance of existing another type 
of object then we should go for inner classes.
Example:
Without existing University object there is no chance of existing Department object 
hence we have to define Department class inside University class.
Example 1:
Without existing Bank object there is no chance of existing Account object hence we 
have to define Account class inside Bank class.
Note : Without existing Outer class Object there is no chance of existing Inner class Object. 
Note:The relationship between outer class and inner class is not IS-A relationship and it 
is Has-A relationship.
Based on the purpose and position of declaration all inner classes are divided into 4 
types.
They are: 
1. Normal or Regular inner classes
2. Method Local inner classes
3. Anonymous inner classes
4. Static nested classes
************************************************
1. Normal (or) Regular inner class:
If we are declaring any named class inside another class directly without static modifier 
such type of inner classes are called normal or regular inner classes.
*/

class Outerr
{
class Innerr
{
}
public static void main(String[] args)
{
System.out.println("outer class main method");
}
}


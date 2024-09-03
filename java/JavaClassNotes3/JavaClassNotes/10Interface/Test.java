/*
Interface methods:
Every method present inside interface is always public and abstract whether we are 
declaring or not. Hence inside interface the following method declarations are equal.
void methodOne();
public Void methodOne();
abstract Void methodOne(); Equal
public abstract Void methodOne();
public: To make this method available for every implementation class.
abstract: Implementation class is responsible to provide implementation .
As every interface method is always public and abstract we can't use the following 
modifiers for interface methods.
Private, protected, final, static, synchronized, native, strictfp.

Interface variables:
 An interface can contain variables
 The main purpose of interface variables is to define requirement level constants.
 Every interface variable is always public static and final whether we are declaring or not.

interface interf
{
int x=10;
}

public: To make it available for every implementation class.
static: Without existing object also we have to access this variable.
final: Implementation class can access this value but cannot modify.

Hence inside interface the following declarations are equal.
int x=10;
public int x=10;
static int x=10;
final int x=10; Equal
public static int x=10;
public final int x=10;
static final int x=10;
public static final int x=10;

 As every interface variable by default public static final we can't declare with the 
following modifiers. 
o Private
o Protected
o Transient
o Volatile

 For the interface variables compulsory we should perform initialization at the 
time of declaration only otherwise we will get compile time error 
interface Interf
{
int x;
}
Output:
Compile time error.
D:\Java>javac Interf.java
Interf.java:3: = expected
int x;   */

//Interface variables can be access from implementation class but cannot be modified.

interface Interf
{
int x=10;
}

class Test implements Interf
{
public static void main(String args[]){
//int x=20;
//here we declaring the variable x.
x=20; // error
System.out.println(x);
}
}
/*Output:
D:\Java>javac Test.java
D:\Java>java Test
20\

Test.java:72: error: cannot assign a value to final variable x
x=20;
^
1 error
*/
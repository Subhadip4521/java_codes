/* 
 If we declare methodOne() method as static then we will get compile time error 
saying "non-static variable x cannot be referenced from a static context".
 From method local inner class we can't access local variables of the method in 
which we declared it. But if that local variable is declared as final then we won't
get any compile time error.
*/
class Test2
{
int x=10;
public void methodOne()
{
int y=20;
class Inner
{
public void methodTwo()
{
System.out.println(x);//10
System.out.println(y); //C.E: local variable y
//is accessed from within inner class; 
//needs to be declared final.
}
}
Inner i=new Inner();
i.methodTwo();
}
public static void main(String[] args)
{
new Test2().methodOne();
}
}
/*
Anonymous inner classes:
 Sometimes we can declare inner class without name such type of inner classes 
are called anonymous inner classes.
 The main objective of anonymous inner classes is "just for instant use".
 There are 3 types of anonymous inner classes 
1. Anonymous inner class that extends a class.
2. Anonymous inner class that implements an interface.
3. Anonymous inner class that defined inside method arguments.


Various possible combinations of nested class &interfaces :
1. class inside a class :
 We can declare a class inside another class
 Without existing one type of object, if there is no chance of existing another type 
of object, then we should go for clas inside a class
class University {
class Department {
 }
}
Without existing University object, there is no chance of existing Department object. 
i.e., Department object is always associated with University 

2. interface inside a class :
We can declare interface inside a class 
class X {
interface Y {
 }
}
Inside class if we required multiple implements of an interface and these 
implementations of relevant to a perticular class, then we should declare interface inside 
a class. 

classVehicleType {
interface Vehicle {
publicintgetNoOfWheels();
 }
class Bus implements Vehicle {
public int getNoOfWheels() {
return 6;
 }
 }
class Auto implements Vehicle {
public int getNoOfWheels() {
return 3;
 }
 }
}

3. interface inside a interface :
We can declare an interface inside another interface. 
interface Map {
interface Entry {
public Object getKey();
public Object getValue();
public Object getValue(Object new );
 }
}
Nested interfaces are always public,static whether we are declaring or not. Hence we 
can implements inner inteface directly with out implementing outer interface. 

interface Outer {
public void methodOne();
interface Inner {
public void methodTwo();
}
}

class Test implements Outer.Inner {
public void methodTwo() {
System.out.println("Inner interface method");
}
public static void main(String args[]) {
 Test t=new Test();
t.methodTwo();
}
}

Whenever we are implementing Outer interface , it is not required to implement Inner 
interfaces.

class Test implements Outer {
public void methodOne() {
System.out.println("Outer interface method ");
}
public static void main(String args[]) {
 Test t=new Test();
t.methodOne();
}
}
i.e., Both Outer and Inner interfaces we can implement independently. 
4. class inside a interface :
We can declare a class inside interface. If a class functionality is closely associated with 
the use interface then it is highly recommended to declare class inside interface 
Example:
interfaceEmailServer {
public void sendEmail(EmailDetails e);
classEmailDetails {
 String from;
 String to;
 String subject;
}
}
In the above example Emaildetails functionality is required for EmailService and we are 
not using anywareelse . Hence we can declare EmailDetails class inside 
EmailServiceinterface .
We can also declare a class inside interface to provide default implementation for that 
interface. 
Example :

interface Vehicle {
public int getNoOfWheels();
class DefaultVehicle implements Vehicle {
public int getNoOfWheels() {
return 3;
 }
}
}

class Bus implements Vehicle {
publicintgetNoOfWheels() {
return 6;
}
}
class Test {
public static void main(String args[]) {
 Bus b=new Bus();
System.out.println(b.getNoOfWheels());
Vehicle.DefaultVehicle d=new Vehicle.DefaultVehicle();
System.out.println(d.getNoOfWheels());
}
}
In the above example DefaultVehicle in the default implementation of Vehicle interface 
where as Bus customized implementation of Vehicle interface. 
The class which is declared inside interface is always static ,hence we can create object 
directly without having outer interface type object.

Conclusions :

1. We can declare anything inside any thing with respect to classes and interfaces. 
2. Nesting interfaces are always public, static whether we are declaring or not.
3. class which is declared inside interface is always public,static whether we are 
declaring or not.

*/


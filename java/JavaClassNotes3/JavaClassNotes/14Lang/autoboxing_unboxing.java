/*
Autoboxing :
Automatic conversion of primitive to wrapper object by compiler is called Autoboxing.
Example :
Integer i=10;
[compiler converts "int" to "Integer" automatically by Autoboxing] 
After compilation the above line will become.
Integer i=Integer.valueOf(10);
That is internally Autoboxing concept is implemented by using valueOf() method.
automatic conversion of wrapper object to primitive by compiler is called 
Autounboxing. 
Example: 
Integer I=new Integer(10);
Int i=I;
[ compiler converts "Integer" to "int" automatically by Autounboxing ] 
After compilation the above line will become. 
Int i=I.intValue();
That is Autounboxing concept is internally implemented by using xxxValue() method. 
Note:
From 1.5 version onwards we can use primitives and wrapper objects interchangly the 
required conversions will be performed automatically by compiler.
Example 1:
import java.util.*;
class AutoBoxingAndUnboxingDemo {
static Integer I=0;
public static void main(String[] args) {
int i=I;
System.out.println(i);//0
}
}

Note :
All wrapper objects are immutable that is once we created a wrapper object we can't 
perform any changes in the existing object. 
If we are trying to perform any changes with those changes a new object will be created.
 Study Material
 Questions and answer
 Examples
 Interview Questions
 Roll
 Demonstratio n
 Interface
 Proper
 Material
 Job interview questions
Example 1:
import java.util.*;
class AutoBoxingAndUnboxingDemo {
public static void main(String[] args) {
Integer x=new Integer(10);
Integer y=new Integer(10);
System.out.println(x==y);//false
}
}

Conclusions :
1. To implement the Autoboxing concept in every wrapper class a buffer of objects 
will be created at the time of class loading. 
2. By Autoboxing if an object is required to create 1st JVM will check whether that 
object is available in the buffer or not.
3. If it is available then JVM will reuse that buffered object instead of creating new 
object.
4. If the object is not available in the buffer then only a new object will be created. 
This approach improves performance and memory utilization.


Overloading with respect to widening, Autoboxing and var-arg methods :
 Case 1: Widening vs Autoboxing : 
Widening:
Converting a lower data type into a higher data type is called widening.
Example: 
import java.util.*; 
class AutoBoxingAndUnboxingDemo { 
public static void methodOne(long l) { 
System.out.println("widening"); 
} 
public static void methodOne(Integer i) { 
System.out.println("autoboxing"); 
} 
public static void main(String[] args) { 
int x=10; 
methodOne(x); 
} 
} 
Output: 
Widening 
Widening dominates Autoboxing. 


 imp :
Widening followed by Autoboxing is not allowed in java but Autoboxing 
followed by widening is allowed. 

 Case 5: 
 import java.util.*; 
 class AutoBoxingAndUnboxingDemo { 
 public static void methodOne(Object o) { 
 System.out.println("Object"); 
 } 
 public static void main(String[] args) { 
 int x=10; 
 methodOne(x); 
 } 
 } 
 Output: 
 Object 


Stringbuffer/builder https://www.youtube.com/watch?v=JEaVfaRJiZw&list=PLd3UqWTnYXOmx_J1774ukG_rvrpyWczm0&index=111

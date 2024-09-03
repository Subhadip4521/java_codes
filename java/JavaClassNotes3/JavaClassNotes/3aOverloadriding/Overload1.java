/*When an overloaded method is called, Java looks for a match between the arguments
used to call the method and the method’s parameters. However, this match need not always
be exact. In some cases, Java’s automatic type conversions can play a role in overload resolution.
For example, consider the following program:
*/
// Automatic type conversions apply to overloading.


class OverloadDemo 
{
void test() 
{
System.out.println("No parameters");
}
// Overload test for two integer parameters.

void test(int a,int b) 
{
System.out.println("a and b: " + a + " " + b);
}

// overload test for a double parameter
void test(double a) 
{
System.out.println("Inside test(double) a: " + a);
}
}

class Overload1 
{
public static void main(String args[]) 
{
OverloadDemo ob = new OverloadDemo();
int i = 88;
ob.test();
ob.test(10, 20);
ob.test(i); // this will invoke test(double)
ob.test(123.2); // this will invoke test(double)
}
}

/*
As you can see, this version of OverloadDemo does not define test(int). Therefore, when
test( ) is called with an integer argument inside Overload, no matching method is found.
However, Java can automatically convert an integer into a double, and this conversion can
be used to resolve the call. Therefore, after test(int) is not found, Java elevates i to double
and then calls test(double). Of course, if test(int) had been defined, it would have been called
instead. Java will employ its automatic type conversions only if no exact match is found.
Method overloading supports polymorphism because it is one way that Java implements
the “one interface, multiple methods” paradigm. To understand how, consider the following.
In languages that do not support method overloading, each method must be given a unique
name. However, frequently you will want to implement essentially the same method for
different types of data. Consider the absolute value function. In languages that do not
support overloading, there are usually three or more versions of this function, each with a
slightly different name. For instance, in C, the function abs( ) returns the absolute value of
an integer, labs( ) returns the absolute value of a long integer, and fabs( ) returns the absolute
value of a floating-point value. Since C does not support overloading, each function has to
have its own name, even though all three functions do essentially the same thing. This makes
the situation more complex, conceptually, than it actually is. Although the underlying concept
of each function is the same, you still have three names to remember. This situation does nstandard class library includes an absolute value method, called abs( ). This method is
overloaded by Java’s Math class to handle all numeric types. Java determines which version
of abs( ) to call based upon the type of argument.
*/
occur in Java, because each absolute value method can use the same name. Indeed, Java’s
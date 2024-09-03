/*Implementing Runnable
The easiest way to create a thread is to create a class 
that implements the Runnable interface.
Runnable abstracts a unit of executable code. 
You can construct a thread on any object that
implements Runnable. To implement Runnable, a class 
need only implement a single method
called run( ), which is declared like this:
public void run( )
Inside run( ), you will define the code that constitutes 
the new thread. It is important to
understand that run( ) can call other methods, use other
 classes, and declare variables, just
like the main thread can. The only difference is that 
run( ) establishes the entry point for
another, concurrent thread of execution within your
 program. This thread will end when
run( ) returns.

Write a thread program which displays 1 to 10 numbers after each and every 1 second
using runnable interface.
*/


class Th1 implements Runnable
{
public void run ()
{
try
{
for (int i=1; i<=10; i++)
{
System.out.println ("VALUE OF I = "+i);
Thread.sleep (1000);
}
}
catch (InterruptedException ie)
{
System.out.println (ie);
}
}
}


class ThDemo2
{
public static void main (String [] args)
{
Runnable t=new Th1 ();
Thread t1=new Thread (t,"ABC");
System.out.println ("THREAD NAME = "+t1.getName ());
System.out.println ("IS T1 ALIVE BEFORE START = "+t1.isAlive ());
t1.start ();
System.out.println ("IS T1 ALIVE AFTER START = "+t1.isAlive ());
}
}
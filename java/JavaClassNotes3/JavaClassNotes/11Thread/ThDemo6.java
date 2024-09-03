/*
Implementing Runnable
The easiest way to create a thread is to create a 
class that implements the Runnable interface.
Runnable abstracts a unit of executable code. You 
can construct a thread on any object that
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


Write a JAVA program which produces 1 to 10 numbers in which even numbers are produced by one
thread and odd numbers are produced by another thread.
*/

class Th1 extends Thread
{
public void run ()
{
try
{
for (int i=1; i<=10; i+=2)
{
System.out.println ("VALUE OF ODD : "+i);
Thread.sleep (1000);
}
}
catch (InterruptedException ie)
{
System.out.println (ie);
}
}
}

class Th2 extends Thread
{
public void run ()
{
try
{
for (int j=2; j<=10; j+=2)
{
System.out.println ("VALUE OF EVEN : "+j);
Thread.sleep (1000);
}
}
catch (InterruptedException ie)
{
System.out.println (ie);
}
}
}

class ThDemo6
{
public static void main (String [] args)
{
Th1 t1=new Th1 ();// object of Thread class
Th2 t2=new Th2 ();// object of Runnable class
//Thread t=new Thread (t2);// Runnable is converted into //Thread object
System.out.println ("BEFORE START T1 IS : "+t1.isAlive ());
System.out.println ("BEFORE START T2 IS : "+t2.isAlive ());
t1.start ();
t2.start ();
System.out.println ("AFTER START T1 IS : "+t1.isAlive ());
System.out.println ("AFTER START T2 IS : "+t2.isAlive ());
try
{
t1.join ();// to make thread to join together for getting performance
t2.join ();
}
catch (InterruptedException ie)
{
System.out.println (ie);
}
System.out.println ("AFTER JOINING T1 IS : "+t1.isAlive ());
System.out.println ("AFTER JOINING T2 IS : "+t2.isAlive ());
}
}


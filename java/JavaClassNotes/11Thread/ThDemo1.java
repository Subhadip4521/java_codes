/*
Write a thread program which displays 1 to 10 numbers after each and every 1 second.
*/
class Th1 extends Thread
{
public void run ()
{
try
{
for (int i=1; i<=10; i++)
{
System.out.println ("VALUE OF I = "+i);
Thread.sleep (2000);
}
}
catch (InterruptedException ie)
{
System.out.println (ie);
}
}
}
class ThDemo1
{
public static void main (String [] args)
{
Th1 t1=new Th1 ();
System.out.println ("IS T1 ALIVE BEFORE START = "+t1.isAlive ());
t1.start ();
System.out.println ("IS T1 ALIVE AFTER START = "+t1.isAlive ());
}
}
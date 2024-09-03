/*
Write a JAVA program to find the threads which are running internally and print priority values.
*/
class ThDemo
{
public static void main (String [] args)
{
Thread t=Thread.currentThread ();
System.out.println(t);
t.setName ("ABC");
System.out.println (t);
System.out.println ("IS IT ALIVE..?"+t.isAlive ());// true
Thread t1=new Thread ();// new state
System.out.println ("IS IT ALIVE..?"+t1.isAlive ());// false
System.out.println ("DEFAULT NAME OF THREAD = "+t1.getName ());// Thread-0
System.out.println ("MAXIMUM PRIORITY VALUE = "+Thread.MAX_PRIORITY);// 10
System.out.println ("MINIMUM PRIORITY VALUE = "+Thread.MIN_PRIORITY);// 1
System.out.println ("NORMAL PRIORITY VALUE = "+Thread.NORM_PRIORITY);// 5
}
}
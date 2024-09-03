class MyThread extends Thread
{
public void run()
{
for (int i=0;i<10;i++)
{
System.out.println("Child thread");
Thread.yield();
}
}
}
class ThreadYield
{
public static void main(String args[])
{
Thread t=new MyThread();
t.start();
for (int i=0;i<10;i++)
{
System.out.println("Main thread");
}
}
}
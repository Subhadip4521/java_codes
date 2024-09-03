/*
Implementing Runnable
The easiest way to create a thread is to create a 
class that implements the Runnable interface.
Runnable abstracts a unit of executable code. You can 
construct a thread on any object that
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


*/



//Here is an example that creates a new thread and starts it running:
// Create a second thread.

class NewThread implements Runnable 
{
Thread t;
NewThread() 
{
// Create a new, second thread
t = new Thread(this, "Demo Thread");
System.out.println("Child thread: " + t);
t.start(); // Start the thread
}
// This is the entry point for the second thread.
public void run() 
{
try {
for(int i = 5; i > 0; i--) {
System.out.println("Child Thread: " + i);
Thread.sleep(500);
}
}catch (InterruptedException e) 
{
System.out.println("Child interrupted.");
}
System.out.println("Exiting child thread.");
}
}
class ThreadDemo 
{
public static void main(String args[]) 
{
new NewThread(); // create a new thread
try 
{
for(int i = 5; i > 0; i--) 
{
System.out.println("Main Thread: " + i);
Thread.sleep(1000);
}
} catch (InterruptedException e) 
{
System.out.println("Main thread interrupted.");
}
System.out.println("Main thread exiting.");
}
}


/*Inside NewThread’s constructor, a new Thread object is created by the following
statement:
t = new Thread(this, "Demo Thread");
Passing this as the first argument indicates that you want the new thread to call the run( )
method on this object. Next, start( ) is called, which starts the thread of execution beginning
at the run( ) method. This causes the child thread’s for loop to begin. After calling start( ),
NewThread’s constructor returns to main( ). When the main thread resumes, it enters its for
loop. Both threads continue running, sharing the CPU, until their loops finish. The output
produced by this program is as follows. (Your output may vary based on processor speed
and task load.)
Child thread: Thread[Demo Thread,5,main]
Main Thread: 5
Child Thread: 5
Child Thread: 4
Main Thread: 4
Child Thread: 3
Child Thread: 2
Main Thread: 3
Child Thread: 1
Exiting child thread.
Main Thread: 2
Main Thread: 1
Main thread exiting.
*/
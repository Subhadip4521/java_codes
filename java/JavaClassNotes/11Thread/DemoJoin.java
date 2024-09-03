/*
Two ways exist to determine whether a thread has finished. First, you can call isAlive( )
on the thread. This method is defined by Thread, and its general form is shown here:
final boolean isAlive( ) The isAlive( ) method returns true if the thread upon which it is 
called is still running. It returns false otherwise.
While isAlive( ) is occasionally useful, the method that you will more commonly use to
wait for a thread to finish is called join( ), shown here: final void join( ) throws 
InterruptedException. This method waits until the thread on which it is called terminates. 
Its name comes from the concept of the calling thread waiting until the specified thread 
joins it. Additional forms of join( ) allow you to specify a maximum amount of time that 
you want to wait for the specified thread to terminate.
Here is an improved version of the preceding example that uses join( ) to ensure that the
main thread is the last to stop. It also demonstrates the isAlive( ) method.
Using join() to wait for threads to finish.
*/


class NewThread implements Runnable 
{
String name; // name of thread
Thread t;
NewThread(String threadname) 
{
name = threadname;
t = new Thread(this, name);
System.out.println("New thread: " + t);
t.start(); // Start the thread
}
// This is the entry point for thread.
public void run() 
{
try {
for(int i = 5; i > 0; i--)
 {
System.out.println(name + ": " + i);
Thread.sleep(1000);
}
} catch (InterruptedException e) {
System.out.println(name + " interrupted.");
}
System.out.println(name + " exiting.");
}
}


class DemoJoin {
public static void main(String args[])
 {
NewThread ob1 = new NewThread("One");
NewThread ob2 = new NewThread("Two");
NewThread ob3 = new NewThread("Three");
System.out.println("Thread One is alive: "+ ob1.t.isAlive());
System.out.println("Thread Two is alive: "+ ob2.t.isAlive());
System.out.println("Thread Three is alive: "+ ob3.t.isAlive());
// wait for threads to finish
try {
System.out.println("Waiting for threads to finish.");
ob1.t.join();
ob2.t.join();
ob3.t.join();
} catch (InterruptedException e) {
System.out.println("Main thread Interrupted");
}
System.out.println("Thread One is alive: "+ ob1.t.isAlive());
System.out.println("Thread Two is alive: "+ ob2.t.isAlive());
System.out.println("Thread Three is alive: "+ ob3.t.isAlive());
System.out.println("Main thread exiting.");
}
}


/*
Sample output from this program is shown here. (Your output may vary based on processor
speed and task load.)
New thread: Thread[One,5,main]
New thread: Thread[Two,5,main]
New thread: Thread[Three,5,main]
Thread One is alive: true
Thread Two is alive: true
Thread Three is alive: true
Waiting for threads to finish.
One: 5
Two: 5
Three: 5
One: 4
Two: 4
Three: 4
One: 3
Two: 3
Three: 3
One: 1
Two: 1
Three: 1
Two exiting.
Three exiting.
One exiting.
Thread One is alive: false
Thread Two is alive: false
Thread Three is alive: false
Main thread exiting.
As you can see, after the calls to join( ) return, the threads have stopped executing.
*/
One: 2
Two: 2
Three: 2
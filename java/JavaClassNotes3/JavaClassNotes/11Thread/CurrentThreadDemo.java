/*
In this program, a reference to the current thread (the main thread, in this case) is obtained
by calling currentThread( ), and this reference is stored in the local variable t. Next, the program
displays information about the thread. The program then calls setName( ) to change the
internal name of the thread. Information about the thread is then redisplayed. Next, a loop
counts down from five, pausing one second between each line. The pause is accomplished
by the sleep( ) method. The argument to sleep( ) specifies the delay period in milliseconds.
Notice the try/catch block around this loop. The sleep( ) method in Thread might throw
an InterruptedException. This would happen if some other thread wanted to interrupt this
sleeping one. This example just prints a message if it gets interrupted. In a real program, you
would need to handle this differently.
*/
// Controlling the main Thread.


class CurrentThreadDemo 
{
public static void main(String args[]) 
{
Thread t = Thread.currentThread();
System.out.println("Current thread: " + t);
// change the name of the thread
t.setName("My Thread");
System.out.println("After name change: " + t);

try 
{
for(int n = 5; n > 0; n--) 
{
System.out.println(n);
Thread.sleep(1000);
}
}
catch (InterruptedException e) 
{
System.out.println("Main thread interrupted");
}


}
}


/* Here is the output generated by this program:
Current thread: Thread[main,5,main]
After name change: Thread[My Thread,5,main]
5
4
3
2
1
Notice the output produced when t is used as an argument to println( ). This displays, in
order: the name of the thread, its priority, and the name of its group. By default, the name
of the main thread is main. Its priority is 5, which is the default value, and main is also the
name of the group of threads to which this thread belongs. A thread group is a data structure
that controls the state of a collection of threads as a whole. After the name of the thread is
changed, t is again output. This time, the new name of the thread is displayed.
*/
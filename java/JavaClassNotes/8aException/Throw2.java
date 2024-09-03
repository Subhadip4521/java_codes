class Throw2
{
void mro() throws InterruptedException
{
System.out.println("sleeping mode");
Thread.sleep(3000);
System.out.println("sleeping mode");
}

void mofficer() throws InterruptedException
{
mro();
}

void eseva()  throws InterruptedException
{
try
{
mofficer();
}
catch(InterruptedException ie)
{
//ie.printStackTrace();
}
}
public static void main(String args[])  throws InterruptedException
{
Throw2 t=new Throw2();
t.eseva();
}
}


//
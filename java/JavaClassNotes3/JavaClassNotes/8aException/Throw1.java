class Throw1
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
mofficer();
}


public static void main(String args[])  throws InterruptedException
{
Throw1 t=new Throw1();
t.eseva();
}
}

//
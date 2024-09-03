class Throw3
{

void mro() 
{
System.out.println("sleeping mode");
try{
Thread.sleep(3000);
}
catch(InterruptedException ie)
{

}
System.out.println("sleeping mode");
}

void mofficer() 
{
mro();
}

void eseva()  
{
mofficer();
}

public static void main(String args[]) 
{
Throw3 t=new Throw3();
t.eseva();
}
}
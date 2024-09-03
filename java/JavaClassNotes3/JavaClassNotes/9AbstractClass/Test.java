class Parent{
Parent()
{
System.out.println("Parent"+this.hashCode());
}
}
class child extends Parent{
child(){
System.out.println("Child"+this.hashCode());
}
}
class Test{
public static void main(String args[]){
child c=new child();
System.out.println("Test"+c.hashCode());
}
}
/*
Shallow cloning vs Deep cloning :
Shallow cloning:
1. The process of creating bitwise copy of an object is called Shallow Cloning .
2. If the main object contain any primitive variables then exactly duplicate copies 
will be created in cloned object.
3. If the main object contain any reference variable then the corresponding object 
won't be created just reference variable will be created by pointing to old 
contained object.
4. By using main object reference if we perform any change to the contained object 
then those changes will be reflected automatically to the cloned object , by 
default Object class clone( ) meant for Shallow Cloning
*/
class Cat 
{
int j ;
Cat(int j) 
{
this.j=j ;
}
}
class Dog implements Cloneable 
{
Cat c ;// reference of Cat
int i ;
Dog(Cat c , int i) 
{
this.c=c ;
this.i=i ;
}
public Object clone( ) throws CloneNotSupportedException 
{
return super.clone( );
}
}
class ShallowClone 
{
public static void main(String[ ] ar) throws CloneNotSupportedException 
{
Cat c=new Cat(20);
Dog d1=new Dog(c , 10);
System.out.println(d1.i +"......"+d1.c.j); // 10......20
Dog d2=(Dog)d1.clone( ) ;
d2.i=888;
d2.c.j=999;
System.out.println(d1.i +"......"+d1.c.j); // 10......999 
}
}
/*
Shallow cloning is the best choice , if the Object contains only primitive values.
In Shallow cloning by using main object reference , if we perform any change to 
the contained object then those changes will be reflected automatically in cloned 
copy.
To overcome this problem we should go for Deep cloning.
*/

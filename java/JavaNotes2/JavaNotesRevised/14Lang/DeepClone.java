/*Deep Cloning :
1. The process of creating exactly independent duplicate object(including contained 
objects also) is called deep cloning. 
2. In Deep cloning , if main object contain any reference variable then the 
corresponding Object copy will also be created in cloned object.
3. Object class clone( ) method meant for Shallow Cloning , if we want Deep 
cloning then the programmer is responsible to implement by overriding clone( ) 
method.
*/
class Cat {
int j ;
Cat(int j) {
this.j=j ;
}
}
class Dog implements Cloneable {
Cat c ;
int i ;
Dog(Cat c , int i) {
this.c=c ;
this.i=i ;
}
public Object clone( ) throws CloneNotSupportedException {
Cat c1=new Cat(c.j) ;
Dog d1=new Dog(c1 , i) ;
return d1 ;
}
}
class DeepClone {
public static void main(String[ ] ar) throws CloneNotSupportedException
{
Cat c=new Cat(20) ;
Dog d1=new Dog(c , 10) ;
System.out.println(d1.i +"......"+d1.c.j); // 10......20
Dog d2=(Dog)d1.clone( ) ;
d1.i=888 ;
d1.c.j=999 ;
System.out.println(d2.i +"......"+d2.c.j); // 10......20
}
}
/*
In Deep cloning by using main Object reference if we perform any change to the 
contained Object those changes won't be reflected to the cloned object.
Which cloning is best ?
If the Object contain only primitive variable then Shallow Cloning is the best choice ,
If the Object contain reference variables then Deep cloning is the best choice. 
Cloning by default deep cloning.

*/
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
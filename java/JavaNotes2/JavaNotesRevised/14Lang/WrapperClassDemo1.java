/*Form 1: 
Every wrapper class except Character class contains a static valueOf() method to create 
wrapper object for the given String.
public static wrapper valueOf(String s); 
*/
class WrapperClassDemo1 {
public static void main(String[] args)throws Exception {
Integer i=Integer.valueOf("10");
Double d=Double.valueOf("10.5");
Boolean b=Boolean.valueOf("ashok");
System.out.println(i);//10
System.out.println(d);//10.5
System.out.println(b);//false
}
}

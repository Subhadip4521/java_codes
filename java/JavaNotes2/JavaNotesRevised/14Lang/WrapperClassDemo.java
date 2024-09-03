/*
Wrapper classes :
The main objectives of wrapper classes are: 
1. To wrap primitives into object form so that we can handle primitives also just 
like objects. 
2. To define several utility functions which are required for the primitives.
Constructors :
1. All most all wrapper classes define the following 2 constructors one can take 
corresponding primitive as argument and the other can take String as argument.
2. Example:
3. 1) Integer i=new Integer(10);
4. 2) Integer i=new Integer("10");
5. If the String is not properly formatted i.e., if it is not representing number then 
we will get runtime exception saying "NumberFormatException". 
7. class WrapperClassDemo {
8. public static void main(String[] args)throws Exception {
9. Integer i=new Integer("ten");
10. System.out.println(i);//NumberFormatException
11. }
12. }
13. Float class defines 3 constructors with float, String and double arguments. 
14. 1) Float f=new Float (10.5f);
15. 2) Float f=new Float ("10.5f");
16. 3) Float f=new Float(10.5);
17. 4) Float f=new Float ("10.5");
18. Character class defines only one constructor which can take char primitive as 
argument there is no String argument constructor. 
19. Character ch=new Character('a');//valid
20. Character ch=new Character("a");//invalid
21. Boolean class defines 2 constructors with boolean primitive and String 
arguments. 
If we want to pass boolean primitive the only allowed values are true, false where 
case should be lower case. 
22. Example:
23. Boolean b=new Boolean(true);
24. Boolean b=new Boolean(false);
25. //Boolean b1=new Boolean(True);//C.E
26. //Boolean b=new Boolean(False);//C.E
27. //Boolean b=new Boolean(TRUE);//C.E
28. If we are passing String argument then case is not important and content is not 
important. If the content is case insensitive String of true then it is treated as true 
in all other cases it is treated as false. 
*/
class WrapperClassDemo {
public static void main(String[] args)throws Exception {
Boolean b1=new Boolean("true");
Boolean b2=new Boolean("True");
Boolean b3=new Boolean("false");
Boolean b4=new Boolean("False");
Boolean b5=new Boolean("ashok");
Boolean b6=new Boolean("TRUE");
System.out.println(b1);//true
System.out.println(b2);//true
System.out.println(b3);//false
System.out.println(b4);//false
System.out.println(b5);//false
System.out.println(b6);//true
}
}

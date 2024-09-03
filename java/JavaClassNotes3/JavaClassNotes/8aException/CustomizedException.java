class TooYoungException extends RuntimeException
{
TooYoungException(String s)
{
super(s);
}
}
class TooOldException extends RuntimeException
{
TooOldException(String s)
{
super(s);
}
}
class CustomizedException
{
public static void main(String args[])
{
int age=Integer.parseInt(args[0]);
if(age>60)
{
throw new TooOldException("Too old");
}
else if(age<18)
{
throw new TooYoungException("Please wait");
}
else
{
System.out.println("You will get soon");
}
}
}
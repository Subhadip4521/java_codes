abstract class Test
{
  public static void display()
  {
    System.out.println("Hello 1");
  }
}
public class Demo extends Test
{
  public static void main(String args[]) 
  {
    display();
    Test.display();
  }
}
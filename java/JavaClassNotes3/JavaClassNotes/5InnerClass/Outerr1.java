/* Inside inner class we can't declare static members. Hence it is not possible to 
declare main() method and we can't invoke inner class directly from the 
command prompt.*/
class Outerr1
{
class Innerr1
{
public static void main(String[] args)
{
System.out.println("inner class main method");
}
}
}
/*java Outerr1
Error: Main method not found in class Outerr1, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
C:\Users\asus\Desktop\JavaClassNotes\5InnerClass>java Innerr1
Error: Could not find or load main class Innerr1
Caused by: java.lang.ClassNotFoundException: Innerr1 */
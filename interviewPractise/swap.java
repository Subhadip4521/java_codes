import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2=sc.nextInt();

        System.out.println("Numbers after swaping are: ");
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }
}

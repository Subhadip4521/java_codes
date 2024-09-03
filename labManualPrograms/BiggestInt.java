import java.util.Scanner;

public class BiggestInt {
    public static void biggest(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            System.out.println(num1+" is the biggest among "+num1+", "+num2+", "+num3);
        }
        if(num2>num1 && num2>num3){
            System.out.println(num2+" is the biggest among "+num1+", "+num2+", "+num3);
        }
        if(num3>num2 && num3>num1){
            System.out.println(num3+" is the biggest among "+num1+", "+num2+", "+num3);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2=sc.nextInt();
        System.out.print("Enter number 3: ");
        int num3=sc.nextInt();

        biggest(num1, num2, num3);
    }
}

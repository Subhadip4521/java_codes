import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1= sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2= sc.nextInt();

        System.out.println("Enter 1 for addition--> ");
        System.out.println("Enter 2 for subtraction--> ");
        System.out.println("Enter 3 for multiplication--> ");
        System.out.println("Enter 4 for division--> ");
        System.out.println("Enter 5 for getting remainder--> ");
        System.out.print("Enter which operation do you want: ");
        int sign=sc.nextInt();

        switch(sign){
            case 1:
                System.out.println(num1+" + "+num2+" = "+(num1+num2));
                break;
            case 2:
                System.out.println(num1+" - "+num2+" = "+(num1-num2));
                break;
            case 3:
                System.out.println(num1+" x "+num2+" = "+(num1*num2));
                break;
            case 4:
                System.out.println(num1+" / "+num2+" = "+(num1/num2));
                break;
            case 5:
                System.out.println("The remainder of "+num1+" and "+num2+" is: "+(num1%num2));
                break;
            default:
                System.out.println("Invalid input...");
        }

    }
}

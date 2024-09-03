import java.util.Scanner;

public class armstrong_number {
    public static void main(String args[]) {
        int copy, result=0,n;
        double p;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        copy=num;
        while(copy!=0){
            n=copy%10;
            p=Math.pow(n, 3);
            result += p;
            copy/=10;
        }
        if(result==num){
            System.out.println(num+" is an armstrong number.");
        }
        else{
            System.out.println(num+" is not an armstrong number.");
        }
        sc.close();
    }
}

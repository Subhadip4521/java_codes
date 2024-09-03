import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int flag=0;

        if(num==0 || num==1){
            System.out.println(num+" is not a prime number.");
        }
        else{
            for(int i=2; i<num; i++){
                if(num%i==0){
                    System.out.println(num+" is not a prime number.");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println(num+" is a prime number.");
        }
    }
}

import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        int i=2;
        while(i<num){
            if(num%i==0){
                System.out.println(num+" is not a prime number.");
                break;
            }
            else{
                System.out.println(num+" is a prime number.");
                break;
            }
        }
        i++;

    }
}

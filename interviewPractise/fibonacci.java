import java.util.Scanner;

public class fibonacci {
    static int n1=0, n2=1, n3;
    static void fib(int num){
        if(num>0){
        
        
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
            fib(num-1);
        
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();

        System.out.print("Fibonacci Series: "+n1+" "+n2+" ");
        fib(num-2);
    }
}


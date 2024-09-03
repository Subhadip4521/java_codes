import java.util.Scanner;

public class ArmstrongNumber {
    public static int len(int n) {
        int i = 0;
        int copy = n;
        while (copy != 0) {
            i++;
            copy /= 10;
        }

        return i;
    }

    public static int armstrong(int n) {
        int sum = 0;
        int copy = n;
        while (copy != 0) {
            int rem = copy % 10;
            sum += Math.pow(rem, len(n));
            copy /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        if (num == armstrong(num)) {
            System.out.println("ARMSTRONG");
        } else {
            System.out.println("NOT ARMSTRONG");
        }
        sc.close();
    }
}

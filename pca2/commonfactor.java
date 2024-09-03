import java.util.Scanner;

public class commonfactor {
    static int commDiv(int a, int b) {
        int count = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
        a = sc.nextInt();
        System.out.print("enter b:");
        b = sc.nextInt();
        System.out.println(commDiv(a, b));

    }
}
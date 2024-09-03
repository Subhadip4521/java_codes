import java.util.Scanner;

public class arrayOfStrings {
    public static void main(String[] args) {
        int size;
        System.out.print("Enter the size of the Array: ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        String s[] = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("String " + (i + 1) + " : ");
            s[i] = sc.next();
        }
        for (int j = size - 1; j >= 0; j--) {
            System.out.print(s[j] + " ");
        }

    }
}

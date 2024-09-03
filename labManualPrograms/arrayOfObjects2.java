import java.util.Scanner;

class obj {
    void display(int n) {
        System.out.println("Object No. " + n);
    }
}

public class arrayOfObjects2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Objects: ");
        int size = sc.nextInt();
        obj o[] = new obj[size];
        for (int i = 0; i < size; i++) {
            o[i] = new obj();
            o[i].display(i);
        }
        sc.close();
    }
}

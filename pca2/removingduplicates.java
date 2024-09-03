import java.util.*;

public class removingduplicates {
    static void removeDuplicate(char str[], int length) {
        int index = 0;

        // Traversing character array
        for (int i = 0; i < length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }

            if (j == i) {
                str[index++] = str[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String info = sc.next();
        char str[] = info.toCharArray();
        int len = str.length;
        removeDuplicate(str, len);
        sc.close();
    }
}

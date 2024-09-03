import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String line=sc.nextLine();
        System.out.println("Given string: "+line);
        int len = line.length();
        char c[] = new char[len];
        for (int j = 0; j < len; j++) {
            c[j] = line.charAt(j);
        }
        int spaceCount = 0;
        int tabCount = 0;
        int newLine = 0;

        for (char ele : c) {
            if (ele == ' ') {
                spaceCount++;
            } 
            else if (ele == '.') {
                newLine++;
            }
            else if (ele == '\t') {
                tabCount++;
            }
        }
        System.out.println("Number of Space: " + spaceCount);
        System.out.println("Number of Tab: " + tabCount);
        System.out.println("Number of New Lines: " + newLine);
        sc.close();

    }
}

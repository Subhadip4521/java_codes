import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        int n,m,p,q;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the rows of 1st Matrix:");
        n = s.nextInt();
        System.out.print("Enter the columns of 1st Matrix:");
        m = s.nextInt();
        System.out.print("Enter the rows of 2nd Matrix:");
        p = s.nextInt();
        System.out.print("Enter the columns of 2nd Matrix:");
        q = s.nextInt();
        int[][] a = new int[n][m];
        if(n!=p){
            System.out.println("The matrices can't be multiplied");
        }
        else{
            int[][] b = new int[p][q];
            int[][] c = new int[n][q];
        System.out.print("Enter the elements of 1st martix:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                a[i][j] = s.nextInt();
            }
        }
        System.out.print("Enter the elements of 2nd martix:");
        for (int i = 0; i < p; i++)
        {
            for (int j = 0; j < q; j++)
            {
                b[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("The Multiplied Matrix is:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        s.close();
        
    }
    
    }
}
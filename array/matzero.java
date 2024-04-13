//For setZeroMatrix() function
//Time complexity - O(n*m)
//Space complexity - O(n+m)
package array;
import java.util.Scanner;
public class matzero {
    public static void setZeroMatrix(int[][] mat, int n, int m) {
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(mat[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(row[i] || col[j]) 
                    mat[i][j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column length: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Enter matrix elements");
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        setZeroMatrix(mat,n,m);
        System.out.println("Resultant matrix");
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

//Time complexity - O(n*m)
//Space complexity - O(n*m)
package array;
import java.util.Scanner;
public class transpose {
    public static int[][] matTranspose(int[][] mat) {
        int n = mat[0].length, m = mat.length;
        int[][] matrix = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                matrix[i][j] = mat[j][i];
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column length: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print("Enter matrix elements: ");
        int[][] mat = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int[][] matrix = matTranspose(mat);
        System.out.println("Resultant matrix");
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

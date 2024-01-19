//For sum() function
//Time complexity - O(n*n)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class diagonal {
    public static int sum(int[][] mat) {
        int sum = 0;
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat.length;j++) {
                if((i==j) || (i+j==mat.length-1))
                    sum += mat[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix dimension: ");
        int n = sc.nextInt();
        System.out.print("Enter matrix elements: ");
        int[][] mat = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal Sum: "+ sum(mat));
        sc.close();
    }
}

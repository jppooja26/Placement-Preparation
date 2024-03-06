//For rotation() and check() function
//Time complexity - O(n*n)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class rotate {
    public static int[][] rotation(int[][] mat) {
        for (int i = 0; i < mat.length / 2; i++) {
            for (int j = i; j < mat.length - 1 - i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[mat.length - 1 - j][i];
                mat[mat.length - 1 - j][i] = mat[mat.length - 1 - i][mat.length - 1 - j];
                mat[mat.length - 1 - i][mat.length - 1 - j] = mat[j][mat.length - 1 - i];
                mat[j][mat.length - 1 - i] = temp;
            }
        }
        return mat;
    }

    public static boolean check(int[][] mat, int[][] tar) {
        boolean flag = true;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != tar[i][j]) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix length: ");
        int n = sc.nextInt();
        System.out.print("Enter matrix elements: ");
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter target matrix length: ");
        int m = sc.nextInt();
        System.out.print("Enter target matrix elements: ");
        int[][] target = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                target[i][j] = sc.nextInt();
            }
        }
        mat = rotation(mat);
        System.out.println("Resultant matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        if (check(mat, target))
            System.out.println("It matches the target matrix");
        else
            System.out.println("It doesn't match the target matrix");
        sc.close();
    }
}

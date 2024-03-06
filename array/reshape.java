//For getMatrix() function
//Time complexity - O(n*m)
//Space complexity - O(r*c)
package array;
import java.util.Scanner;
class reshape {
    public static int[][] getMatrix(int[][] mat, int r, int c) {
        int[][] matrix = new int[r][c];
        int x = 0, y = 0;
        if(mat.length*mat[0].length == r*c) {
            for(int i=0;i<mat.length;i++) {
                for(int j=0;j<mat[0].length;j++) {
                    if(y == c) {
                        y = 0;
                        x++;
                    }
                    matrix[x][y] = mat[i][j];
                    y++;
                }
            }
            return matrix;
        }
        return mat;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix row and column: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print("Enter matrix elements: ");
        int[][] mat = new int[x][y];
        for(int i=0;i<x;i++) {
            for(int j=0;j<y;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter target row and column: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        mat = getMatrix(mat, r, c);
        System.out.println("Reusltant matrix");
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
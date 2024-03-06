//For luckyNum(), minRow() and checkLuckyNum() functions
//Time complexity - O(n*m)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class lucky {
    public static int luckyNum(int[][] mat, int n, int m) {
        int row = mat.length;
        int col = mat[0].length;
        int res = 0;
        for(int i=0;i<n;i++) {
            int minRowIndex = minRow(mat,i,col);
            int num = mat[i][minRowIndex];
            if(checkLuckyNum(mat,minRowIndex,num,row))
                res = num;
        }
        return res;
    }
    public static int minRow(int[][] mat, int i, int col) {
        int j = 0, min = mat[i][j], minRow = 0;
        for(j=1;j<col;j++) {
            if(mat[i][j] < min) {
                min = mat[i][j];
                minRow = j;
            }
        }
        return minRow;
    }
    public static boolean checkLuckyNum(int[][] mat, int j, int num, int row) {
        for(int i=0;i<row;i++) {
            if(mat[i][j] > num) return false;
        }
        return true;
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
        System.out.println("Lucky number in the matrix: "+ luckyNum(mat,n,m));
        sc.close();
    }
}

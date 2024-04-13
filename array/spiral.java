//For printSpiral() function
//Time complexity - O(r*c)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class spiral {
    public static void printSpiral(int[][] mat) {
        int l=0,r=mat[0].length-1,t=0,b=mat.length-1;
        System.out.print("Resultant matrix: ");
        while(l<=r && t<=b) {
            for(int i=l;i<=r;i++) {
                System.out.print(mat[t][i]+" ");
            }
            t++;
            for(int i=t;i<=b;i++) {
                System.out.print(mat[i][r]+" ");
            }
            r--;
            if(t<=b) {
                for(int i=r;i>=l;i--) {
                    System.out.print(mat[b][i]+" ");
                }
                b--;
            }
            if(l<=r) {
                for(int i=b;i>=t;i--) {
                    System.out.print(mat[i][l]+" ");
                }
                l++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column value: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("Enter matrix elements: ");
        int[][] mat = new int[r][c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        printSpiral(mat);
        sc.close();
    }
}

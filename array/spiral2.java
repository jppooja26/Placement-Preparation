//For generateMat() function
//Time complexity - O(n*n)
//Space complexity - O(n*n)
package array;
import java.util.Scanner;
public class spiral2 {
    public static void generateMat(int n) {
        int[][] mat = new int[n][n];
        int k=1,t=0,b=mat.length-1,l=0,r=mat[0].length-1;
        while(l<=r && t<=b) {
            for(int i=l;i<=r;i++) {
                mat[t][i] = k;
                k++;
            }
            t++;
            for(int i=t;i<=b;i++) {
                mat[i][r] = k;
                k++;
            }
            r--;
            if(t<=b) {
                for(int i=r;i>=l;i--) {
                    mat[b][i] = k;
                    k++;
                }
                b--;
            }
            if(l<=r) {
                for(int i=b;i>=t;i--) {
                    mat[i][l] = k;
                    k++;
                }
                l++;
            }
        }
        System.out.println("Resulant matrix");
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        generateMat(n);
        sc.close();
    }
}

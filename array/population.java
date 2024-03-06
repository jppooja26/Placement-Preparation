//for maxPop() function
//Time complexity - O(n)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class population {
    public static int maxPop(int[][] arr) {
        int[] pop = new int[2051];
        int res = 0;
        for(int[] l: arr) {
            ++pop[l[0]];
            --pop[l[1]];
        }
        for(int i=1950;i<2051;i++) {
            pop[i] += pop[i-1];
            res = pop[i] > pop[res] ? i : res;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        System.out.print("Enter birth and death year: ");
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++) {
            for(int j=0;j<2;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Earliest year with maximum population: "+ maxPop(arr));
        sc.close();
    }
}

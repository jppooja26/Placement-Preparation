//Time complexity - O(n*m)
//Space complexity - O(1) for richest() function
package array;
import java.util.Scanner;
public class customer {
    public static int richest(int[][] account) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<account.length;i++) {
            int sum = 0;
            for(int j=0;j<account[i].length;j++) {
                sum += account[i][j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        System.out.print("Enter number of banks: ");
        int m = sc.nextInt();
        int[][] account = new int[n][m];
        System.out.print("Enter wealth: ");
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                account[i][j] = sc.nextInt();
            }
        }
        System.out.println("Richest wealth of the customer: "+ richest(account));
        sc.close();
    }
}

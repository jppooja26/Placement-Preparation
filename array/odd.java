//For oddValue() function
//Time complexity - O(n)
//Space complexity - O()
package array;
import java.util.Scanner;
public class odd {
    public static int oddValue(int[][] ind, int m, int n) {
        int[] row = new int[m];
        int[] col = new int[n];
        for(int[] rc: ind) {
            row[rc[0]]++;
            col[rc[1]]++;
        }
        int oddRow = 0;
        for(int i=0;i<row.length;i++) {
            if(row[i]%2==1)
                oddRow++;
        }
        int oddCol = 0;
        for(int i=0;i<col.length;i++) {
            if(col[i]%2==1)
                oddCol++;
        }
        int odds = (oddRow * n) + (oddCol * m);
        int even = oddRow * oddCol;
        if(odds>0 && oddRow>0 && oddCol>0) {
            odds = odds - (2*even);
        }
        return odds;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column length: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.print("Enter row and column length of indices: ");
        int x =  sc.nextInt();
        int y = sc.nextInt();
        System.out.print("Enter indices value: ");
        int[][] ind = new int[x][y];
        for(int i=0;i<x;i++) {
            for(int j=0;j<y;j++) {
                ind[i][j] = sc.nextInt();
            }
        }
        System.out.println("Number of odd valued cell: "+ oddValue(ind,m,n));
        sc.close();
    }
}

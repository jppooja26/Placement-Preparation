//For spiralMatrix() function
//Time complexity - O(row * col)
//Space complexity - O(row * col)
package array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class spiral3 {
    public static int[][] spiralMatrix(int row, int col, int rStart, int cStart) {
        List<int[]> res = new ArrayList<>();
        int[][] dirt = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int d = 0, len = 0;
        res.add(new int[]{rStart, cStart});
        while(res.size() < row*col) {
            if(d==0 || d==2) len++;
            for(int i=0;i<len;i++) {
                rStart += dirt[d][0];
                cStart += dirt[d][1];
                if(rStart>=0 && rStart<row && cStart>=0 && cStart<col) 
                    res.add(new int[]{rStart,cStart});
            }
            d = (d+1)%4;
        }
        return res.toArray(new int[row*col][2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column length: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.print("Enter start row and column length: ");
        int rStart = sc.nextInt();
        int cStart = sc.nextInt();
        int[][] res = spiralMatrix(row, col, rStart, cStart);
        System.out.print("Resultant indicies: ");
        for(int i=0;i<res.length;i++) {
            for(int j=0;j<res[0].length;j++) {
                System.out.print(+res[i][j]+" ");
            }
            System.out.print(", ");
        }
        sc.close();
    }
}

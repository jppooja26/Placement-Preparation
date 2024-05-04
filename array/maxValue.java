//For findMaxValue() function
//Time complexity - O(nlogn)
//Space complexity - O(n)
package array;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import javafx.util.Pair;
public class maxValue {
    public static int findMaxValue(int[][] arr, int k) {
        int ans = Integer.MIN_VALUE;
        Queue<Pair<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b)
        -> a.getKey().equals(b.getKey()) ? b.getValue() - a.getValue() 
        : b.getKey() - a.getKey());
        for(int[] p: arr) {
            int x = p[0];
            int y = p[1];
            while(!maxHeap.isEmpty() && x - maxHeap.peek().getValue() > k) {
                maxHeap.poll();
            }
            if(!maxHeap.isEmpty())
                ans = Math.max(ans, x + y + maxHeap.peek().getKey());
            maxHeap.offer(new Pair<>(y-x, x));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of points: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        System.out.print("Enter points: ");
        for(int i=0;i<n;i++) {
            for(int j=0;j<2;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int res = findMaxValue(arr,k);
        System.out.println("Maximum value of the equation: "+ res);
        sc.close();
    }
}

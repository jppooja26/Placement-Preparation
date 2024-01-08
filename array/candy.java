//Time complexity - O(n)
//Space complexity - O(n)
package array;
import java.util.Arrays;
import java.util.Scanner;
public class candy {
    public static void greatest(int[] arr, int extra) {
        boolean[] res = new boolean[arr.length];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            max = Math.max(max, arr[i]);
        }
        for(int i=0;i<arr.length;i++) {
            if(max<=(arr[i]+extra))
                res[i] = true;
            else
                res[i] = false;
        }
        System.out.println("Result: "+ Arrays.toString(res));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of kids: ");
        int n = sc.nextInt();
        System.out.print("Enter number of candies for each kid: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number of extra candies: ");
        int extra = sc.nextInt();
        greatest(arr,extra);
        sc.close();
    }
}
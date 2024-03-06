//For maxSubarray() function
//Time complexity - O(n)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class subarray {
    public static int maxSubarray(int[] arr) {
        int sum = 0, maxi = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
            maxi = Math.max(maxi, sum);
            if(sum < 0)
                sum = 0;
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum subarray sum: "+ maxSubarray(arr));
        sc.close();
    }
}

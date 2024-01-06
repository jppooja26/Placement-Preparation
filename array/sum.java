//Time complexity - O(n)
//Space complexity - O(1)
package array;
import java.util.Arrays;
import java.util.Scanner;

public class sum {
    public static void runningSum(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
            arr[i] = sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        runningSum(arr);
        System.out.println("Running sum array: "+ Arrays.toString(arr));
        sc.close();
    }
}

//Time complexity - O(n)
//Space complexity - O(n)
package array;
import java.util.Scanner;
import java.util.Arrays;
public class concat {
    public static void concatArray(int[] arr) {
        int[] res = new int[2*arr.length];
        for(int i=0;i<arr.length;i++) {
            res[i] = arr[i];
            res[arr.length+i] = arr[i];
        }
        System.out.print("Concatenated array: "+ Arrays.toString(res));
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
        concatArray(arr);
        sc.close();
    }
}

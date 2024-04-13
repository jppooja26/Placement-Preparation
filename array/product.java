//For getArray() function
//Time complexity - O(n)
//Space complexity - O(n)
package array;
import java.util.Scanner;
public class product {
    public static int[] getArray(int[] arr) {
        int[] res = new int[arr.length];
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0] = 1; 
        right[arr.length-1] = 1;
        for(int i=1;i<arr.length;i++) {
            left[i] = left[i-1] * arr[i-1];
        }
        for(int i=arr.length-2;i>=0;i--) {
            right[i] = right[i+1] * arr[i+1];
        }
        for(int i=0;i<arr.length;i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        arr = getArray(arr);
        System.out.print("Resultant array: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}

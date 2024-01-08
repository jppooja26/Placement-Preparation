//Time complexity - O(n*n)
//Space complexity - O(n)
package array;
import java.util.Arrays;
import java.util.Scanner;
public class smallest {
    public static void smallestArray(int[] arr) {
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            int count = 0;
            for(int j=0;j<arr.length;j++) {
                if(arr[i]>arr[j])
                    count++;
            }
            res[i] = count;
        }
        System.out.println("Resultant array: "+ Arrays.toString(res));
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
        smallestArray(arr);
        sc.close();
    }
}

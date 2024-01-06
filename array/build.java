//Time complexity - O(n)
//Space complexity - O(1)
package array;
import java.util.Arrays;
import java.util.Scanner;
class build {
    public static void buildArray(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            arr[i] += arr.length * (arr[arr[i]] % arr.length);
        }
        for(int i=0;i<arr.length;i++) {
            arr[i] = arr[i] / arr.length;
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
        buildArray(arr);
        System.out.println("Array: "+ Arrays.toString(arr));
        sc.close();
    }
}
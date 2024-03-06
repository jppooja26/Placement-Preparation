//For getIndex() function
//Time complexity - O(n)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class duplicates {
    public static int getIndex(int[] arr) {
        int index = 1;
        for(int i=1;i<arr.length;i++) {
            if(arr[i]!=arr[i-1]) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
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
        n = getIndex(arr);
        System.out.print("Resultant matrix: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}

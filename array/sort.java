//For sortArray() function
//Time complexity - O(n)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class sort {
    public static void sortArray(int[] arr) {
        int c0 = 0, c1 = 0, c2 = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 0)
                c0++;
            else if(arr[i] == 1)
                c1++;
            else
                c2++;
        }
        int j =0;
        while(c0>0) {
            arr[j] = 0;
            c0--;
            j++;
        }
        while(c1>0) {
            arr[j] = 1;
            c1--;
            j++;
        }
        while(c2>0) {
            arr[j] = 2;
            c2--;
            j++;
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
        sortArray(arr);
        System.out.print("Resultant sorted array: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    } 
}

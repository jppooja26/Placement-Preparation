//For generateArray() function
//Time complexity - O(n)
//Space complexity - O(n)
package array;
import java.util.Scanner;
public class zeroSum {
    public static int[] generateArray(int n) {
        int[] arr = new int[n];
        int c0 = 0,c1 = 0;
        int mid = n / 2;
        for(int i=0;i<n;i++) {
            if(i<mid) {
                c0--;
                arr[i] = c0;
            }
            else if(i==mid && n!=(2*mid)) {
                c0 = 0;
                arr[i] = c0;
            }
            else {
                c1++;
                arr[i] = c1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr = generateArray(n);
        System.out.print("Generated array: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}

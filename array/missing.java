//For findMissing() function
//Time complexity - O(n)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class missing {
    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static int findMissing(int[] arr, int n) {
        for(int i=0;i<n;i++) {
            int x = arr[i];
            while(x>0 && x<=n && x!=i+1 && arr[x-1]!=x) {
                swap(arr,i,x-1);
                x = arr[i];
            }
        }
        for(int i=0;i<n;i++) {
            if(arr[i]==i+1) continue;
            return i+1;
        }
        return n+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing value: "+ findMissing(arr, n));
        sc.close();
    }
}

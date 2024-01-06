//Time complexity - O(n)
//Space complexity - O(n)
package array;
import java.util.Scanner;
import java.util.ArrayList;
public class shuffle {
    public static void shuffleArray(int[] arr, int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++) {
            res.add(arr[i]);
            res.add(arr[i+n]);
        }
        System.out.println("Resultant array: "+ res.toString());
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
        System.out.print("Enter length: ");
        int len = sc.nextInt();
        shuffleArray(arr,len);
        sc.close();
    }
}
//For findRob() function
//Time complexity - O(n)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class rob {
    public static int findRob(int[] arr) {
        int rob = 0, norob = 0;
        for(int i=0;i<arr.length;i++) {
            int newRob = norob + arr[i];
            int newNoRob = Math.max(rob,norob);
            rob = newRob;
            norob = newNoRob;
        }
        return Math.max(rob,norob);
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
        int res = findRob(arr);
        System.out.println("Maximum money that can be robbed: "+ res);
        sc.close();
    }
}

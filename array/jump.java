//For canReach() function
//Time complexity - O(n)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class jump {
    public static boolean canReach(int[] arr) {
        int reach = 0;
        for(int i=0;i<arr.length;i++) {
            if(reach<i)
                return false;
            reach = Math.max(reach, i+arr[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Can we reach the end: "+ canReach(arr));
        sc.close();
    }
}

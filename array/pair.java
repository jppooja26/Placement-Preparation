//For goodPair() function
//Time complexity - O(n*n)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class pair {
    public static int goodPair(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] == arr[j])
                    count++;
            }
        }
        return count;
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
        System.out.println("Number of good pairs: "+ goodPair(arr));
        sc.close();
    }
}

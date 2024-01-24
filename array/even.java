//Time complexity - O(d), O(n*d)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class even {
    public static boolean Even(int num) {
        int len=0;
        while(num>0) {
            len++;
            num/=10;
        }
        if(len%2==0)
            return true;
        return false;
    }
    public static int evenCount(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(Even(arr[i]))
                count++;
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
        System.out.println("Count of even digits: "+ evenCount(arr));
        sc.close();
    }
}

//For addArray() function
//Time complexity - O(max(n, log(k)))
//Space complexity - O(max(n, log(k)))
package array;
import java.util.Scanner;
import java.util.ArrayList;
public class add {
    public static void addArray(int[] arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        int carry = 0, i = 0;
        for(i=arr.length-1; i>=0; i--) {
            res.add(0, (arr[i]+carry+(k%10)) % 10);
            carry = (arr[i] + carry + (k%10)) / 10;
            k/=10;
        }
        while(k!=0) {
            res.add(0, (carry + (k%10))%10);
            carry = (carry + (k%10)) / 10;
            k/=10;
        }
        for(int r = i; r>=0; r--) {
            res.add(0, (arr[r] + carry)%10);
            carry = (carry + arr[r]) / 10;
        }

        if(carry != 0) res.add(0, carry);
        
        System.out.println("Resultant array: "+ res.toString());

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        addArray(arr,k);
        sc.close();
    }
}

//For calculatedCost() function
//Time complexity - O(n)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class cost {
    public static int calculatedCost(int[] arr) {
        int e=0, o=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%2==0)
                e++;
            else
                o++;
        }
        return Math.min(e,o);        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Cost: "+ calculatedCost(arr));
        sc.close();
    }
}
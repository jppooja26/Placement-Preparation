//For check() function
//Time complexity - O(n)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class goodArray {
    public static boolean check(int[] arr) {
        int x = arr[0],y;
        for(int a: arr) {
            while(a>0) {
                y = x % a;
                x = a;
                a = y;
            }
        }
        return x==1;
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
        if(check(arr))
            System.out.println("Yes, it's a good array");
        else
            System.out.println("No, it's not a good array");
        sc.close();
    }
}

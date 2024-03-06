//For sumIndex() function
//Time complexity - O(n*n)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class twosum {
    public static int[] sumIndex(int[] arr, int tar) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if((arr[i]+arr[j]) == tar)
                    return new int[] {i,j};
            }
        }
        return new int[] {-1};
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
        System.out.print("Enter target value: ");
        int tar = sc.nextInt();
        arr = sumIndex(arr,tar);
        if(arr[0]!=-1)
            System.out.println("Index: ["+ arr[0]+","+ arr[1]+"]");
        else
            System.out.println("Target value not found");
        sc.close();
    }
}

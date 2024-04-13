//For findPosition() function
//Time complexity - O(log n)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class position {
    public static int[] findPosition(int[] arr, int tar) {
        int left = 0, right = arr.length-1;
        int first = -1, last = -1;
        while(left<=right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == tar) {
                first = mid;
                last = mid;
                while(first>0 && arr[first-1]==tar) {
                    first--;
                }
                while(last<arr.length-1 && arr[last+1]==tar) {
                    last++;
                }
                break;
            }
            else if(arr[mid]<tar)
                left = mid+1;
            else
                right = mid-1;
        }
        return new int[]{first, last};
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
        System.out.print("Enter target value: ");
        int tar = sc.nextInt();
        arr = findPosition(arr,tar);
        System.out.print("Result: ["+ arr[0]+", "+arr[1]+"]");
        sc.close();
    }
}

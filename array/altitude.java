//For highestAltitude() function
//Time complexity - O(n)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class altitude {
    public static int highestAltitude(int[] gain) {
        int max = 0, sum = 0;
        for(int i=0;i<gain.length;i++) {
            sum += gain[i];
            max = Math.max(sum, max);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of altitudes: ");
        int n = sc.nextInt();
        System.out.print("Enter net gain in the altitude: ");
        int[] gain = new int[n];
        for(int i=0;i<n;i++) {
            gain[i] = sc.nextInt();
        }
        System.out.println("Highest altitude: "+ highestAltitude(gain));
        sc.close();
    }
}

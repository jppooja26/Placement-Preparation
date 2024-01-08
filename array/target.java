//Time complexity - O(n*n) add() takes O(n)
//Space complexity - O(n)
package array;
import java.util.Scanner;
import java.util.ArrayList;
public class target {
    public static void targetArray(int[] num, int[] ind) {
        ArrayList<Integer> target = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            target.add(ind[i], num[i]);
        }
        System.out.println("Target array: " + target.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        System.out.print("Enter numbers to be inserted: ");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.print("Enter index for those numbers: ");
        int[] ind = new int[n];
        for (int i = 0; i < n; i++) {
            ind[i] = sc.nextInt();
        }
        targetArray(num, ind);
        sc.close();
    }
}

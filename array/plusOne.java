//For operation() function
//Time complexity - O(n)
//Space complexity - O(n)
package array;
import java.util.Scanner;
public class plusOne {
    public static int[] operation(int[] digit) {
        for(int i=digit.length-1;i>=0;i--) {
            if(digit[i]<9) {
                digit[i]++;
                return digit;
            }
            digit[i] = 0;
        }
        digit = new int[digit.length + 1];
        digit[0] = 1;
        return digit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter digit elements: ");
        int[] digit = new int[n];
        for(int i=0;i<n;i++) {
            digit[i] = sc.nextInt();
        }
        digit = operation(digit);
        System.out.print("Resultant digit: ");
        for(int i=0;i<digit.length;i++) {
            System.out.print(digit[i]+" ");
        }
        sc.close();
    }
}

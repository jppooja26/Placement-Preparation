//Time complexity - O(n)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class pangram {
    public static boolean checkPangram(String str) {
        int[] res = new int[26];
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
                res[str.charAt(i)-'a']++;
            else
                return false;
        }
        for(int i=0;i<res.length;i++) {
            if(res[i]<1)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        if(checkPangram(str))
            System.out.println("It is a Pangram");
        else
            System.out.println("It is not a Pangram");
        sc.close();
    }
}

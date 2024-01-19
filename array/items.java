//For totalCount() function
//Time complexity - O(n)
//Space complexity - O(1)
package array;
import java.util.Scanner;
public class items {
    public static int totalCount(String[][] items, String ruleKey, String ruleValue) {
        int count = 0;
        for(int i=0;i<items.length;i++) {
            if("type".equals(ruleKey) && ruleValue.equals(items[i][0]))
                count++;
            else if("color".equals(ruleKey) && ruleValue.equals(items[i][1]))
                count++;
            else if("name".equals(ruleKey) && ruleValue.equals(items[i][2]))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        String[][] items = new String[n][3];
        System.out.print("Enter type, color and name of the products: ");
        for(int i=0;i<n;i++) {
            for(int j=0;j<3;j++) {
                items[i][j] = sc.next();
            }
        }
        System.out.print("Enter ruleKey: ");
        String ruleKey = sc.next();
        System.out.print("Enter ruleValue: ");
        String ruleValue = sc.next(); 
        System.out.print("Count: "+ totalCount(items, ruleKey, ruleValue));
        sc.close();
    }
}

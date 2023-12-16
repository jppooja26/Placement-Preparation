package first_java;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String str = sc.nextLine();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--) {
            rev += str.charAt(i);
        }
        if(str.equals(rev)) 
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
        sc.close();
    }
}

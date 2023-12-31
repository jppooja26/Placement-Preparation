package function;

import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(int n) {
        int temp = n, sum = 0;
        while(temp>0) {
            sum = sum*10 + temp%10;
            temp /= 10;
        }
        if(sum == n)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(isPalindrome(n))
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is not a Palindrome");
        sc.close();
    }
}

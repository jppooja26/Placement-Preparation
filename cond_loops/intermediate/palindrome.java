package cond_loops.intermediate;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, num1 = 0;
        while(temp > 0) {
            num1 = (num1*10) + (temp%10);
            temp /= 10;
        }

        if(num1 == num) 
            System.out.println("Palindrome number");
        else
            System.out.println("Not a Palindrome number");
        sc.close();
    }
}

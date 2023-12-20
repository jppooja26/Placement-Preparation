package cond_loops.intermediate;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++) {
            fact = fact * 1;
        }
        System.out.println("Factorial of the number: "+fact);
        sc.close();
    }
}

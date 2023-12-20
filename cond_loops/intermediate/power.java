package cond_loops.intermediate;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base value: ");
        int base = sc.nextInt();
        System.out.print("Enter an exponent value: ");
        int exp = sc.nextInt();
        System.out.println("Power: "+ Math.pow(base,exp));
        sc.close();
    }
}

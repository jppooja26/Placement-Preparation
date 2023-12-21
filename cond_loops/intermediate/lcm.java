package cond_loops.intermediate;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = 1;
        for (int i = 2; i <= Math.max(a, b) / 2; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                res *= i;
                a /= i;
                b /= i;
            } else if ((a % i == 0)) {
                res *= i;
                a /= i;
            } else if ((b % i == 0)) {
                res *= i;
                b /= i;
            }
        }
        res = res*a*b;
        System.out.println("LCM: " + res);
        sc.close();
    }
}

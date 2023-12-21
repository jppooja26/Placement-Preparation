package cond_loops.intermediate;

import java.util.Scanner;

public class invest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter present value: ");
        double p = sc.nextDouble();
        System.out.print("Enter interest rate: ");
        double i = sc.nextDouble();
        System.out.print("Enter number of period: ");
        double n = sc.nextDouble();
        i = Math.pow(1+i, n);
        System.out.println("Future value: "+ (p*i));
        sc.close();
    }
}

package cond_loops.intermediate;

import java.util.Scanner;

public class compound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter number of times interest in compounded per year: ");       
        double n = sc.nextDouble();
        System.out.print("Enter time in years: ");
        double t = sc.nextDouble();
        r = Math.pow((1 + (r/n)), n*t);
        System.out.println("Coumpound interest: "+ (float)p*r);
        sc.close();
    }
}

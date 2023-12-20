package cond_loops.intermediate;

import java.util.Scanner;

public class depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter v value: ");
        double v = sc.nextFloat();
        System.out.print("Enter r value: ");
        double r = sc.nextFloat();
        System.out.print("Enter t value: ");
        double t = sc.nextFloat();
        r = Math.pow(1-(r/100), t);
        System.out.println("Depreciation value: "+v*r);
        sc.close();
    }
}

package cond_loops.basic;

import java.util.Scanner;

public class vol_sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double r = sc.nextDouble();
        System.out.println("Volume of sphere: "+ (4/3)*3.14*r*r*r);
        sc.close();
    }
}

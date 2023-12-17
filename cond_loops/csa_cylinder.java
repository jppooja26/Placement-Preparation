package cond_loops;

import java.util.Scanner;

public class csa_cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius and height of the cylinder: ");
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Curved surface area of cylinder: "+(2*3.14*r*h));
        sc.close();
    }
}

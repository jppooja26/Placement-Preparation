package cond_loops;

import java.util.Scanner;

public class peri_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();
        System.out.println("Perimeter of the circle: "+(2*3.14*r));
        sc.close();
    }
}

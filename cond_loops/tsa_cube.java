package cond_loops;

import java.util.Scanner;

public class tsa_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length of the cube: ");
        int a = sc.nextInt();
        System.out.println("Total surface area of cube: "+ (6*a*a));
        sc.close();
    }
}

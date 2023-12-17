package cond_loops;

import java.util.Scanner;

public class peri_equi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the side: ");
        int a = sc.nextInt();
        System.out.println("Perimeter of the equilateral triangle: "+(3*a));
        sc.close();
    }
}

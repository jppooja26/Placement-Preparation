package cond_loops;

import java.util.Scanner;

public class peri_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length of the square: ");
        int a = sc.nextInt();
        System.out.println("Perimeter of the square: "+ 4*a);
        sc.close();
    }
}

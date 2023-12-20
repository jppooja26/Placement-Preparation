package cond_loops.basic;

import java.util.Scanner;

public class peri_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length of the rhombus: ");
        int a = sc.nextInt();
        System.out.println("Perimeter of the rhombus: "+ 4*a);
        sc.close();
    }
}

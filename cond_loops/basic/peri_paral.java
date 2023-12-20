package cond_loops.basic;

import java.util.Scanner;

public class peri_paral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and side of parallelogram: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Perimeter of the parallelogram: "+ (2*(a+b)));
        sc.close();
    }
}

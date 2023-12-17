package cond_loops;

import java.util.Scanner;

public class vol_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length, width and height of the pyramid: ");
        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("Volume of pyramid: "+ (l*w*h)/3);
        sc.close();
    }
}

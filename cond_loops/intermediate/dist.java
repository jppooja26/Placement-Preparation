package cond_loops.intermediate;

import java.util.Scanner;

public class dist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coordinates of point x: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Enter coordinates of point y: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);
        System.out.println("Distance between two points: "+ Math.sqrt(x+y));
        sc.close();
    }
}

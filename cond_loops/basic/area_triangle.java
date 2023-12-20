package cond_loops.basic;
import java.util.Scanner;
public class area_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter breadth of the triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter height of the triangle: ");
        int h = sc.nextInt();
        System.out.println("Area of triangle: "+ (0.5*b*h));
        sc.close();
    }
}

package cond_loops.basic;
import java.util.Scanner;
public class area_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        int r = sc.nextInt();
        System.out.println("Area of the circle: "+ (3.14*r*r));
        sc.close();
    }
}
package cond_loops.basic;
import java.util.Scanner;
public class area_equi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length: ");
        int a = sc.nextInt();
        System.out.println("Area of equilateral triangle: "+(1.732/4)*a*a);
        sc.close();
    }
}

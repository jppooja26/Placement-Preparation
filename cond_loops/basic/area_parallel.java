package cond_loops.basic;
import java.util.Scanner;
public class area_parallel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of parallelogram: ");
        int b = sc.nextInt();
        System.out.print("Enter the height of parallelogram: ");
        int h = sc.nextInt();
        System.out.println("Area of the parallelogram: "+(b*h));
        sc.close();
    }
}

package cond_loops.basic;
import java.util.Scanner;
public class area_iso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of two equal sides: ");
        double a = sc.nextDouble();
        System.out.print("Enter the other length: ");
        double b = sc.nextDouble();
        double c = Math.pow(a,a) - (Math.pow(b,b)/4);
        c = Math.sqrt(c);
        System.out.println("Area of the isoceles triangle: " + (0.5 * c * b));
        sc.close();
    }
}

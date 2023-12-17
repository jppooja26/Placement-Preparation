package cond_loops;
import java.util.Scanner;
public class vol_cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height of cone: ");
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Volume of the cone: "+(3.14*r*r)*(h/3));
        sc.close();
    }
}

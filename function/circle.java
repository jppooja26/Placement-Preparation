package function;

import java.util.Scanner;

public class circle {
    public static double circum(double r) {
        return (2*3.14*r);
    }
    public static double area(double r) {
        return (3.14*r*r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();
        System.out.println("Circumference: "+ circum(r));
        System.out.println("Area: "+ area(r));
        sc.close();
    }
}

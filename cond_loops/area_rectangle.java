package cond_loops;
import java.util.Scanner;
public class area_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth of the rectangle: ");
        int b = sc.nextInt();
        System.out.println("Area of the rectangle: "+(l*b));
        sc.close();
    }
}

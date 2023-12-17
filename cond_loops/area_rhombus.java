package cond_loops;
import java.util.Scanner;
public class area_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of two diagonals: ");
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        System.out.println("Area of the rhombus: "+(d1*d2*0.5));
        sc.close();
    }
}
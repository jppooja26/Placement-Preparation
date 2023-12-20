package cond_loops.basic;
import java.util.Scanner;
public class peri_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of breadth of rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Perimeter of the rectangle: "+ 2*(l+b));
        sc.close();
    }
}
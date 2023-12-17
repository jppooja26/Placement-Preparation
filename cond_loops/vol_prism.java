package cond_loops;
import java.util.Scanner;
public class vol_prism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base and height value of prism: ");
        int b = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("Volume of the prism: "+ (b*h));
        sc.close();
    }
}

package cond_loops.basic;
import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum: "+(a+b));
        sc.close();
    }
}

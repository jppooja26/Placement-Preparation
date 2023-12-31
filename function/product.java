package function;

import java.util.Scanner;

public class product {
    public static int pro(int a, int b) {
        return (a*b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product: "+ pro(a,b));
        sc.close();
    }
}

package cond_loops.intermediate;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter market price of the product: ");
        int mp = sc.nextInt();
        System.out.print("Enter selling price of the product: ");
        int sp = sc.nextInt();
        float dis = mp - sp;
        System.out.println("Discount: "+ (dis/mp) * 100);
        sc.close();
    }
}

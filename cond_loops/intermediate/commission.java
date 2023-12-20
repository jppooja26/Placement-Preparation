package cond_loops.intermediate;

import java.util.Scanner;

public class commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double amount = sc.nextInt();
        double commission_percent = 15;
        System.out.println("Commission amount: "+ (commission_percent/100) * amount);
        sc.close();
    }
}

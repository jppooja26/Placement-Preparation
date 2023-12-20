package cond_loops.intermediate;

import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units used: ");
        int units = sc.nextInt();
        if(units < 100)
            System.out.println("Amount to be paid: "+units*10);
        else if(units >= 100 && units < 200)
            System.out.println("Amount to be paid: "+units*15);
        else if(units >= 200 && units < 300)
            System.out.println("Amount to be paid: "+units*20);
        else
            System.out.println("Amount to be paid: "+units*25);
        sc.close();
    }
}

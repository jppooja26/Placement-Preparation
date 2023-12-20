package cond_loops.intermediate;

import java.util.Scanner;

public class batting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total runs scored: ");
        int runs = sc.nextInt();
        System.out.print("Enter number of matches: ");
        int match = sc.nextInt();
        System.out.print("Enter number of not-outs: ");
        int not_out = sc.nextInt();
        if((match - not_out) != 0)
            System.out.println("Batting average: "+ runs/(match - not_out));
        else
            System.out.println("Average cannot be determined!");
        sc.close();
    }
}

package cond_loops.intermediate;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter n values: ");
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum += sc.nextInt();
        }
        System.out.println("Sum: "+sum);
        sc.close();
    }
}

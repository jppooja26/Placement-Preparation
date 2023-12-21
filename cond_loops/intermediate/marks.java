package cond_loops.intermediate;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        System.out.print("Enter marks: ");
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum += sc.nextInt();
        }
        System.out.print("Average: "+ sum/n);
        sc.close();
    }
}

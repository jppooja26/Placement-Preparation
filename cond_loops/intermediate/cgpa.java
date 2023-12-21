package cond_loops.intermediate;

import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of subjects: ");
        int n = sc.nextInt();
        System.out.print("Enter marks: ");
        double sum = 0;
        for(int i=0;i<n;i++) {
            sum += sc.nextDouble();
        }
        System.out.println("CGPA: "+sum/n);
        System.out.println("CGPA Percentage: "+ (sum/n)*9.5);
        sc.close();
    }
}

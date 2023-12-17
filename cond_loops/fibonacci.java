package cond_loops;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0;
        System.out.print("Fibonaaci series: "+a+" "+b+" ");
        while(n-2>0) {
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
            n--;
        }
        sc.close();
    }
}

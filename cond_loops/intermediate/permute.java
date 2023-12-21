package cond_loops.intermediate;

import java.util.Scanner;

public class permute {
    public static int fact(int n) {
        int f = 1;
        for(int i=1;i<=n;i++) {
            f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        System.out.println("nPr: "+ fact(n)/fact(n-r));
        System.out.println("nCr: "+ fact(n)/(fact(r)*fact(n-r)));
        sc.close();
    }
}

package cond_loops.intermediate;

import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = 1;
        for(int i=1;i<Math.max(a, b);i++) {
            if((a%i==0) && (b%i==0)) 
                res = i;
        }
        System.out.println("HCF: "+res);
        sc.close();
    }
}

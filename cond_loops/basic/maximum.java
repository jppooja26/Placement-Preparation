package cond_loops.basic;

import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter series of numbers (0 to exit): ");
        int mx = 0;
        while(true) {
            int num = sc.nextInt();
            if(num == 0)
                break;
            if(mx < num) 
                mx = num;
        }
        System.out.println("Maximum number: "+mx);
        sc.close();
    }
}

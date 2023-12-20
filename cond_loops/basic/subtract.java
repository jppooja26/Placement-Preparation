package cond_loops.basic;

import java.util.Scanner;

public class subtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int pro = 1, sum = 0;
        while(num>0) {
            int r = num % 10;
            pro *= r;
            sum += r;
            num /=10;
        } 
        System.out.println("Difference of the product and sum of digits: " + (pro - sum));
        sc.close();
    }
}

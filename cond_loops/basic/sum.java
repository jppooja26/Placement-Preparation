package cond_loops.basic;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter series of numbers (0 to exit): ");
        int sum = 0;
        while(true) {
            int num = sc.nextInt();
            if(num == 0)
                break;
            sum += num;
        }
        System.out.println("Sum: "+sum);
        sc.close();
    }
}

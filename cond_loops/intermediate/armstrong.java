package cond_loops.intermediate;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, temp1 = num, len = 0, sum = 0;
        while(temp > 0) {
            len++;
            temp /= 10;
        }

        while(temp1 > 0) {
            sum += Math.pow(temp1%10, len);
            temp1 /= 10;
        }

        if(sum == num)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
        sc.close();
    }
}

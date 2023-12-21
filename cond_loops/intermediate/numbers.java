package cond_loops.intermediate;

import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a series of number (0 to exit): ");
        int even=0,odd=0,neg=0;
        while(true) {
            int e = sc.nextInt();
            if(e==0)
                break;
            if(e<0)
                neg += e;
            else if(e>0 && e%2==0)
                even += e;
            else
                odd += e;
        }
        System.out.println("Sum of negative number: "+neg);
        System.out.println("Sum of positive even numbers: "+even);
        System.out.println("Sum of positive odd numbers: "+odd);
        sc.close();
    }
}

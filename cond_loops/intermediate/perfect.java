package cond_loops.intermediate;

import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int res = 0;
        for(int i=1;i<=num/2;i++) {
            if(num%i==0)
                res += i;
        }
        if(num == res) 
            System.out.println("Perfect number");
        else
            System.out.println("Not a perfect number");
        sc.close();
    }
}

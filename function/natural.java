package function;

import java.util.Scanner;

public class natural {
    public static int sum(int n) {
        return (n*(n+1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Sum of natural numbers: "+ sum(n));
        sc.close();
    }
}

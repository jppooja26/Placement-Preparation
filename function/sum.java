package function;

import java.util.Scanner;

public class sum {
    public static int add(int a, int b) {
        return (a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum: "+ add(a,b));
        sc.close();
    }
}

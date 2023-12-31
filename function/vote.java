package function;

import java.util.Scanner;

public class vote {
    public static boolean eligibility(int n) {
        if(n>=18)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(eligibility(age))
            System.out.println("Person is eligible to vote");
        else
            System.out.println("Person is not eligible to vote");
        sc.close();
    }
}

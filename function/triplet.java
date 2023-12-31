package function;

import java.util.Scanner;

public class triplet {
    public static boolean isTriplet(int a, int b, int c) {
        if(Math.pow(c, 2) == (Math.pow(a,2) + Math.pow(b,2)))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter triplet values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(isTriplet(a,b,c))
            System.out.println("It is a triplet");
        else
            System.out.println("It is not a triplet");
        sc.close();
    }
}

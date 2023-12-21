package cond_loops.intermediate;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        String nstr = "";
        for(int i=str.length()-1;i>=0;i--) {
            nstr += str.charAt(i);
        }
        System.out.println("Reversed string: "+ nstr);
        sc.close();
    }
}

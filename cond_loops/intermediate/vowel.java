package cond_loops.intermediate;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String ch = sc.nextLine();
        if(ch.charAt(0) == 'a' || ch.charAt(0) == 'e' || ch.charAt(0) == 'i' 
        || ch.charAt(0) == 'o' || ch.charAt(0) == 'u') 
            System.out.println("Vowel");
        else if(ch.charAt(0) == 'A' || ch.charAt(0) == 'E' || ch.charAt(0) == 'I' 
        || ch.charAt(0) == 'O' || ch.charAt(0) == 'U') 
            System.out.println("Vowel");
        else 
            System.out.println("Consonent");
        sc.close();
    }
}

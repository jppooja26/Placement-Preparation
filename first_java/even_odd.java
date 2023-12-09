package first_java;
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("It's an even number");
        else
            System.out.println("It's an odd number");
        sc.close();
    }
}
package first_java;
import java.util.Scanner;
public class greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello "+name+"! Welcome to Java Programming");
        sc.close();
    }
}

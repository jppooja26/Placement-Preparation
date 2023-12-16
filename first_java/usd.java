package first_java;
import java.util.Scanner;
public class usd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in Rupees: ");
        int rupee = sc.nextInt();
        double usd = rupee * 0.012;
        System.out.println("Equivalent USD: "+usd);
        sc.close();
    }
}

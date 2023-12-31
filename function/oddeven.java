package function;
import java.util.Scanner;
public class oddeven {
    public static boolean check(int n) {
        if(n%2==0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(check(num))
            System.out.println("Even number");
        else
            System.out.println("Odd number");
        sc.close();
    }
}

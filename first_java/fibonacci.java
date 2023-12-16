package first_java;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.print(0+" "+1+" ");
        int a=0, b=1, c=0;
        for(int i=0;i<n-2;i++) {
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        sc.close();
    }
}

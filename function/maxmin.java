package function;
import java.util.Scanner;
public class maxmin {
    public static int max(int a, int b, int c) {
        int mx = a;
        if(b>mx)
            mx = b;
        if(c>mx)
            mx = c;
        return mx;
    }
    public static int min(int a, int b, int c) {
        int mn = a;
        if(b<mn)
            mn = b;
        if(c<mn)
            mn = c;
        return mn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maximum = max(a,b,c);
        int minimum = min(a,b,c);
        System.out.println("Maximum element: "+ maximum);
        System.out.println("Minimum element: "+minimum);
        sc.close();
    }
}

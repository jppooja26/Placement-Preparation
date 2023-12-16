package first_java;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        int sum1 = 0, sum2 = 0, temp1 = a, temp2 = b, len1 = 0, len2 = 0;
        int temp3 = a, temp4 = b;
        while(temp1>0) {
            len1++;
            temp1/=10;
        }
        while(temp2>0) {
            len2++;
            temp2/=10;
        }
        while(a>0) {
            sum1 += Math.pow(a%10,len1);
            a/=10;
        }
        while(b>0) {
            sum2 += Math.pow(b%10,len2);
            b/=10;
        }

        if(temp3 == sum1) 
            System.out.print(a+" is an Armstrong number");
        if(temp4 == sum2)
            System.out.println(b+" is an Armstrong number");
        else
            System.out.println("Neither of them is an Armstrong number");
        sc.close();
    }
}

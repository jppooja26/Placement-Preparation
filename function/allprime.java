package function;

import java.util.Scanner;

public class allprime {
    public static String prime(int a, int b) {
        StringBuffer sb = new StringBuffer();
        for(int i=a;i<=b;i++) {
            boolean flag = false;
            for(int j=2;j<=Math.sqrt(i);j++) {
                if(i%j == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag)
                sb.append(i+" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Prime numbers: "+ prime(a,b));
        sc.close();
    }
}

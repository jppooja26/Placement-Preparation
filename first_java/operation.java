package first_java;
import java.util.Scanner;
public class operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operation: ");
        char op = sc.next().charAt(0);
        if(op == '+')
            System.out.println("The sum is "+(num1+num2));
        else if(op == '-')
            System.out.println("The difference is "+(num1-num2));
        else if(op == '*')
            System.out.println("The product is "+(num1*num2));
        else if(op == '/')
            try {
                System.out.println("The quotient is "+(num1/num2));
            } catch (ArithmeticException e) {
                System.out.println("Division by zero is not possible");
            }
        else
            System.out.println("Invalid operation");
        sc.close();
    }
}

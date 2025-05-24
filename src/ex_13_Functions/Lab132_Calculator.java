package ex_13_Functions;

import java.util.Scanner;

public class Lab132_Calculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = readInteger(scanner, "Enter a = ");
        int b = readInteger(scanner, "Enter b = ");
            int R_sum=  sum( a, b);
            int R_sub=  subtract( a, b);
            int R_mul=  multiply( a, b);
        String R_div = (b != 0) ? String.valueOf(divide(a, b)) : "Cannot divide by zero";


        System.out.println("Sum = " + R_sum);
        System.out.println("Subtraction = " + R_sub);
        System.out.println("Multiplication = " + R_mul);
        System.out.println("Division = " + R_div);

    }
    static int readInteger(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // consume the invalid input
            }
        }
    }

    static int sum(int a,int b){
        return a+b;
    }
    static int subtract(int a,int b){
        return a-b;
    }static int multiply(int a,int b){
        return a*b;
    }static int divide(int a,int b){
        return a/b;
    }
}

package ex_25_Exceptions;

import java.util.Scanner;

public class Lab216_RealUsageOfFinally {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int v = sc.nextInt();

        try {
            int a = 10 / v;

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally {
            sc.close();
            System.out.println("closing scanner");
        }
    }

}

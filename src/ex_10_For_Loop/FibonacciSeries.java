package ex_10_For_Loop;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println("Print "+n+ " fibonacci series ");
        int n1=0,n2=1,n3;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 0; i <n-2 ; i++) {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;

        }

    }
}

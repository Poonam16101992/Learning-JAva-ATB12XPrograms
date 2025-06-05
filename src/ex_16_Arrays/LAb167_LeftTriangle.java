package ex_16_Arrays;

import java.util.Scanner;

public class LAb167_LeftTriangle {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size");
        int n= scanner.nextInt();

        for (int i = n; i >=0 ; i--) {//               v
            for (int j = 0; j <=i ; j++) {//
                System.out.print("*");

            }
            System.out.println();

        }
    }
}

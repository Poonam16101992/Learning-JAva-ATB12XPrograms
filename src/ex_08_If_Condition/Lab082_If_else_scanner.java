package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_else_scanner {

    public static void main(String[] args) {
        //CLI
       // int age= Integer.parseInt(args[0]);

        //scanner class
        System.out.println("Enter Your Age");
        Scanner scanner= new Scanner(System.in);
        int age = scanner.nextInt();
        if (age>18){
            System.out.println("Allowed to vote");
        }
        else{
            System.out.println("Not allowed");
        }
    }
}

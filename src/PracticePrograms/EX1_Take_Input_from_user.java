package PracticePrograms;

import java.util.Scanner;

public class EX1_Take_Input_from_user {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the name");
        String name= scanner.nextLine();
        System.out.println("Enter Age");
        int age= scanner.nextInt();
        System.out.println("Hello! "+name+".You're age is "+age+".");
        scanner.close();
    }
}

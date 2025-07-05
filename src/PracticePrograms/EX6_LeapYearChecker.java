package PracticePrograms;

import java.util.Scanner;

public class EX6_LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Year");
        int Year=sc.nextInt();
        if((Year%4==0 && Year%100!=0)||(Year%400==0)){
            System.out.println("this is a leap year");
        }else{
            System.out.println("This is not a leap year");
        }
    }
}

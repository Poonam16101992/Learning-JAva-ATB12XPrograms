package PracticePrograms;

import java.util.Scanner;

//Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
//
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
public class EX5_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the score");
        int score= sc.nextInt();
        char Grade;
        if(score >=90 && score<=100){
            Grade='A';
        }else if(score >=80 && score<=89){
            Grade='B';
        }else if(score >=70 && score<=79){
            Grade='C';
        }else if(score >=60 && score<=69){
            Grade='D';
        }else {
            Grade='E';
        }
        System.out.println("Your Grade is "+Grade);
    }
}

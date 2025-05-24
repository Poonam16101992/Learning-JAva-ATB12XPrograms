package ex_9_SwitchStatements;

import java.util.Scanner;

//user will enter a number from 1 to 7 and system will tell which day it is
public class Lab084_Days_Of_The_week {
    public static void main(String[] args) {
       //Step 1
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number");
       if (scanner.hasNextInt()) {
           int num = scanner.nextInt();// user will input value
           switch (num){

               case 1:
                   System.out.println("Mon");
                   break;                       // optimized the code using break
               case 2:
                   System.out.println("Tue");
                   break;
               case 3:
                   System.out.println("Wed");
                   break;
               case 4:
                   System.out.println("Thu");
                   break;
               case 5:
                   System.out.println("Fri");
                   break;
               case 6:
                   System.out.println("Sat");
                   break;
               case 7:
                   System.out.println("Sun");
                   break;
               default:
                   System.out.println("Enter Valid data"); // optimized the code using default
           }

       }
           else {
           System.out.println("Enter Valid data");
       }



        }


    }


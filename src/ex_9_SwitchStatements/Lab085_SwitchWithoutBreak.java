package ex_9_SwitchStatements;

import java.util.Scanner;

public class Lab085_SwitchWithoutBreak {
    public static void main(String[] args) {

//user will enter a number from 1 to 7 and system will tell which day it is

                           //Step 1
                Scanner scanner= new Scanner(System.in);
                System.out.println("Enter the number");
                if (scanner.hasNextInt()) {
                    int num = scanner.nextInt();// user will input value
                    switch (num){

                        case 1:
                            System.out.println("Mon");

                                                  case 2:
                            System.out.println("Tue");

                        case 3:
                            System.out.println("Wed");

                        case 4:
                            System.out.println("Thu");

                        case 5:
                            System.out.println("Fri");

                        case 6:
                            System.out.println("Sat");

                        case 7:
                            System.out.println("Sun");

                        default:
                            System.out.println("Enter Valid data"); // optimized the code using default
                    }

                }
                else {
                    System.out.println("Enter Valid data");
                }



            }


        }






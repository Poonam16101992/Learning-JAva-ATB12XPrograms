package ex_11_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class Lab122_Number_Guessing_Game {

    public static void main(String[] args) {

        Random random= new Random();
        int GuessNum= random.nextInt(100);
        System.out.println(GuessNum);


        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts=0;

        while (true){

            if(!scanner.hasNextInt()){
                System.out.println("Please enter integer");
                scanner.next();
                continue;

            }

            guess= scanner.nextInt();
            attempts++;

            if(guess<1||guess>100){
                System.out.println("Please enter bewteen 1 to 100");
            }

            if(guess<GuessNum){
                System.out.println("Low");
            }
            else if (guess>GuessNum) {
                System.out.println("High");
            }
            else {
                System.out.println("Guessed the number "+ GuessNum+" in "+attempts+" attempts");
break;
            }

        }



    }
}

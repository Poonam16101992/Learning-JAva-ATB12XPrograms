package ex_11_WhileLoop;

import java.util.Scanner;

public class Lab121_FactorialUsingWhile {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number for which you want factorial!");
        if(!scanner.hasNextInt()){
            System.out.println("Enter the int");
            return;

        }
        int num= scanner.nextInt();
        if(num<=0){
            System.out.println("Factorial not defined for negative numbers");
            return;
        }

        int Fact=1;
        int i=1;
        while(i<=num){
            Fact=Fact*i;
           i++;

        }System.out.println(Fact);}

    }




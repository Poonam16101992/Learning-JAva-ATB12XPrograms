package Exception_Tasks;

import java.util.Scanner;

public class CodingChallenge2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a= ");
        int a= sc.nextInt();
        System.out.println("Enter b= ");
        int b= sc.nextInt();


       try{
           int c=a/b;
           System.out.println(c);
       } catch (ArithmeticException e) {
           System.out.println(e.getMessage());;
       }finally {
           System.out.println("finally executed");
       }

    }
}

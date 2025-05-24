package ex_15_StringBuffer_StringBuilder;

import java.util.Scanner;

public class Lab151_Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the word");
        String input= sc.next();
        input=input.toLowerCase();
        String Reversed= "";
        for (int i = input.length() - 1; i >= 0; i--) {

            Reversed = Reversed + input.charAt(i);
        }
            if(input.equals(Reversed)){
                System.out.println("Palindrome");
        }else{
                System.out.println("Not a palindrome");
            }


        }

    }

package PracticePrograms;

import java.util.Scanner;

public class EX4_Palindrome {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the word");
        String input =scanner.nextLine();
        String s= input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String r="";
        for (int i = s.length()-1; i >=0 ; i--) {
         r=r+s.charAt(i);

        }


        if(r.equals(s)){
            System.out.println("This is a palindrome");
        }
        else{
            System.out.println("That's not a palindrome");
        }
    }
}

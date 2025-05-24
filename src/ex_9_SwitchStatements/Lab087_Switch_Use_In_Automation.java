package ex_9_SwitchStatements;

import java.util.Scanner;

public class Lab087_Switch_Use_In_Automation {
    public static void main(String[] args) {
        //web automation, user wants to give input from different browsers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser= scanner.nextLine();
        browser= browser.toLowerCase();// this will change the entered value to lower case

        switch(browser){
            case "chrome":
                System.out.println("Starting chrome bowser");
                System.out.println("TC1...");
                System.out.println("TC2..");
                break;

            case "firefox":
                System.out.println("STarting firefox");
                break;

            case "edge":
                System.out.println("Starting edge");
                break;

            default:
                System.out.println("No idea, which browser is this");
                break;


        }
    }
}


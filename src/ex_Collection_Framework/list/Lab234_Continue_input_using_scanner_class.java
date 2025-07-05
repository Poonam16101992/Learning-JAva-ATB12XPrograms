package ex_Collection_Framework.list;

import java.util.Scanner;

public class Lab234_Continue_input_using_scanner_class {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        String continueInput = "Y";

        while(continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter the name");
            String name = scanner.next();
            System.out.println("Do you want to add name? Y/N");
            continueInput=scanner.nextLine();

        }
        scanner.close();
    }
}

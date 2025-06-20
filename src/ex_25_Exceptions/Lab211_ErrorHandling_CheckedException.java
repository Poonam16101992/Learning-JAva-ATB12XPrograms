package ex_25_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab211_ErrorHandling_CheckedException {
    public static void main(String[] args) {
        try {
            FileInputStream files = new FileInputStream("C://log.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

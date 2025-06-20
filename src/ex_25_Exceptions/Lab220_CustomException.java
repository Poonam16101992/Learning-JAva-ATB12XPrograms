package ex_25_Exceptions;

public class Lab220_CustomException {
    public static void main(String[] args) {
        int age = 15;

        if(age<18) {
            try {
                throw new Exception("Age below 18");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        else{
                System.out.println("You can go clubbing");
            }
        }
        }



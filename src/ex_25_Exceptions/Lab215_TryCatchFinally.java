package ex_25_Exceptions;

public class Lab215_TryCatchFinally {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("this will be executed always");
        }
    }
}

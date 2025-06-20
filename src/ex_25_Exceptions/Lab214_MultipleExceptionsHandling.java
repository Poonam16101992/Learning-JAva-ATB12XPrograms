package ex_25_Exceptions;

public class Lab214_MultipleExceptionsHandling {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
            String s = null;
            s.trim();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}

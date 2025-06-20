package ex_25_Exceptions;

public class Lab210_ErrorHandling_UncheckedException {
    public static void main(String[] args) {
        try {
            int a=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}

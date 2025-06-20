package ex_25_Exceptions;

public class Lab218_Exception {
    public static void main(String[] args) {

    try {
        String v = args[0];//ArrayOutOfBound
        int i = Integer.parseInt(v);//NumberFormat
        int c = 10 / i;//Arithmetic
    }catch (Exception e){
        System.out.println(e.getMessage());
    }finally {
        System.out.println("I will be executed always");
    }
}
}

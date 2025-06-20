package ex_25_Exceptions;

public class Lab212_StackTracePrint {
    public static void main(String[] args) {
        String s1= null;
       try{
           s1.trim();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
}

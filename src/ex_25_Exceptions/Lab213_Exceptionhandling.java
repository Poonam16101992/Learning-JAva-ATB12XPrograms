package ex_25_Exceptions;

public class Lab213_Exceptionhandling {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        try{
            int c=10/a;}
//        }catch(ArithmeticException e){
//            System.out.println(e.getMessage());
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
      catch(Throwable e){
            System.out.println(e.getMessage());
        }

    }
}

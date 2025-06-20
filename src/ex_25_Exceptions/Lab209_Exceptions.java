package ex_25_Exceptions;

public class Lab209_Exceptions {
    public static void main(String[] args) {

        String input= args[0];//If input is blank :ArrayIndexOutOfBoundsException

        int number= Integer.parseInt(input);//If input is String:NumberFormatException

        int Divide= 100/number;//If input is 0:.ArithmeticException

        System.out.println(Divide);

        String a= null;

        System.out.println(a.trim());//NullPointerException
    }
}

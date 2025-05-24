package ex_13_Functions;

public class Lab128_Functions_Return_NonReturn_Type {
    public static void main(String[] args) {
        Non_Return_Function();
        int a = Return_Function();
        System.out.println(a);
    }
    static void Non_Return_Function(){
        System.out.println("Hi,Non-return type function");
    }
    static int Return_Function(){
        System.out.println("Hi,Return type function");
        return 10;
    }
}//// we can return any data type float, boolean,string


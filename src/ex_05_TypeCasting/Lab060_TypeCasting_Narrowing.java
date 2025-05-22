package ex_05_TypeCasting;

public class Lab060_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int a=300;
        byte b= (byte) a;// explicit narrowing
        System.out.println(b);
    }
}

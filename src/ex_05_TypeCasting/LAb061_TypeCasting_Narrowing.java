package ex_05_TypeCasting;

public class LAb061_TypeCasting_Narrowing {
    public static void main(String[] args) {
         long l = 7906408959l;// 64 bits
         short s = (short) l;// explicit narrowing// 16 bits
        System.out.println(s);
    }
}

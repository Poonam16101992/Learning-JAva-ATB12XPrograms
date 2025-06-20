package ex_24_WrapperClass;

public class Lab207_Autoboxing_Unboxing {
    public static void main(String[] args) {
        int a=10;
        Integer b=a;//Autoboxing- a(int) wrapped in b(Integer)
        System.out.println(a);
        System.out.println(b.intValue());


        Integer c=11;
        int d=c;//Unboxing- d will lose all the functionalities
        System.out.println(c);
        System.out.println(d);
    }
}

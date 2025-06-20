package ex_22_StaticKeyword;

public class Lab199_StaticBlock {
    public static void main(String[] args) {
A a= new A();
    }
}
class A{
    static{
        System.out.println("Called automatically when class is loaded");
    }
    static int a=10;
    static void m(){
        System.out.println("Function");
    }
}

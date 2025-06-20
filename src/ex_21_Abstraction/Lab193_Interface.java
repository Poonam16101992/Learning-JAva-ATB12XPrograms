package ex_21_Abstraction;

public class Lab193_Interface {
    public static void main(String[] args) {
        A a= new A();
        a.a1();
        a.b1();
        a.c1();
        a.b2();
        a.c2();
    }
}
class A implements B,C{

    void a1() {
        System.out.println("a1");
    }
    @Override
     public void b1(){
        System.out.println("b1");
    }

    @Override
    public void b2() {
        System.out.println("b2");
    }


    @Override
    public void c1() {
        System.out.println("c1");
    }

    @Override
    public void c2() {System.out.println("c2");

    }
}
interface B{
    void b1();
    void b2();
}
interface  C{
    void c1();
    void c2();
}

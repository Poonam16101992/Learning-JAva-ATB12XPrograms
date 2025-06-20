package ex_21_Abstraction;

public class Lab194_MultipleInheritance {
    public static void main(String[] args) {
       Child Poonam= new Child();
       Poonam.inherit();
    }
}
class Child implements father1,mother1{
void inherit(){
    f1();
    money();
    m1();
    df();
}
    @Override
    public void f1() {
        System.out.println("father1");
    }

    @Override
    public void m1() {
        System.out.println("mother1");
    }

    @Override
    public void money() {
        System.out.println("earn yourself");
    }

    @Override
    public void df() {

    father1.super.df();
    mother1.super.df();

    }
}
interface father1{
    void f1();
   void money();
    default void df(){
        System.out.println("default from father1");
    }
}
interface mother1{
    void m1();
    void money();
    default void df(){
        System.out.println("default from mother1");
    }
}

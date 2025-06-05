package ex_19_OOPs_Inheritance_Polymorphism.MethodOverridingPolyMorphism;

public class Father {

    void f1(){
        System.out.println("f1 father");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void home(){
        System.out.println("father home");
    }
}

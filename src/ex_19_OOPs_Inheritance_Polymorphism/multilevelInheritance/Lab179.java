package ex_19_OOPs_Inheritance_Polymorphism.multilevelInheritance;

public class Lab179 {

    public static void main(String[] args) {
        Son Praveen= new Son();
        Praveen.car();
        Praveen.home();
        Praveen.money();

       // Son s1= new Father();// not possible
        Father f1= new Son();//Dynamic Dispatch
        GrandFather G1= new Father();
        GrandFather G2= new Son();

    }
}

package ex_19_OOPs_Inheritance_Polymorphism.AccessModifier.police;

public class Cop {
    protected int gun;
    String icard;

    public Cop(int gun){// constructor
        this.gun=gun;

    }
    protected void CanIshoot(){
        System.out.println("Yes You can shoot");
    }
}

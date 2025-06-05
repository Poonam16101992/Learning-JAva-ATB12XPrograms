package ex_19_OOPs_Inheritance_Polymorphism.AccessModifier.police;

public class JrCop {
    public static void main(String[] args) {

        Cop JrCop= new Cop(11);
        JrCop.CanIshoot();
        System.out.println(JrCop.gun);
    }
}

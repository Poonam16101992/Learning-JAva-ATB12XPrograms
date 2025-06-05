package ex_19_OOPs_Inheritance_Polymorphism.AccessModifier;

public class Exmple {

}
class Home{

    public void fridge(){
        System.out.println("fridge");
    }
    private void jewelry(){
        System.out.println("gold");

    }
    void sell_gold(){
        jewelry();//private functions can be called within the class
    }
}

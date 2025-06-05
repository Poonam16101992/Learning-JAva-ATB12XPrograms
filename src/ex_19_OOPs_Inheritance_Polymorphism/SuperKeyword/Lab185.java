package ex_19_OOPs_Inheritance_Polymorphism.SuperKeyword;

public class Lab185 {
}
class Father{

    public int gold=10;

    void home(){
        System.out.println("Home father");
    }
    Father(){
        System.out.println("Constructor Father");
    }
}
class Son extends Father{
    void bike(){}
 void Home2(){
     super.home();
     System.out.println(super.gold);
    this.bike();
 }
 public Son(){
     super();
 }

}

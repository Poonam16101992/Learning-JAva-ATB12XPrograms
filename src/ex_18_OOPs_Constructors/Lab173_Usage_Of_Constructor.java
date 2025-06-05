package ex_18_OOPs_Constructors;

public class Lab173_Usage_Of_Constructor {
    public static void main(String[] args) {
        A a1= new A();
        System.out.println("last step");
    }

}
class A{

    A(){

        System.out.println("Read file in csv");
        System.out.println("open page");
        System.out.println("Do n no, of things ");
    }
}

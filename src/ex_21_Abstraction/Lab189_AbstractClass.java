package ex_21_Abstraction;

public class Lab189_AbstractClass {
    public static void main(String[] args) {
Son s1= new Son();
s1.loan();// loan details of father is hidden which is called abstraction
       // Father f1= new Father();//Father is an abstract class and cannot be instantiated
    }
}
class Normal{
    //concrete class/complete class
}
abstract class Father{
    abstract void loan();//This is an abstract method and it does not have a body and is incomplete
}
class Son extends Father{

    @Override
    void loan() {
        System.out.println("Loan is paid");
    }
}
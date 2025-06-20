package ex_21_Abstraction;

public class Lab196_InterfaceExample {
    public static void main(String[] args) {
pramod m= new pramod();
m.display();

    }
}
interface p {
    int a=10;//public int
    void display();//abstract method
}
class pramod implements p{

    @Override
    public void display() {
        System.out.println(a);
    }
}
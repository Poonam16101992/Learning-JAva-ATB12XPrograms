package ex_21_Abstraction;

public class Lab190_SuperAbstraction {
    public static void main(String[] args) {
        Car WagonR = new Car();
        WagonR.drive();//we have hidden implementations such as stop engine start engine
    }
}
abstract class Engine{
    abstract void startEngine();
    void stopEngine(){
        System.out.println("Engine is stopped");
    }
}
class Car extends Engine implements Tyre,Gear{
    @Override
    void startEngine(){
        System.out.println("Engine is started");
    }
    void drive(){
        rubberTyre();
        blackColourTyre();
        startEngine();
        changeGear();
        stopEngine();

    }

    @Override
    public void rubberTyre() {
        System.out.println("rubber tyre");
    }

    @Override
    public void blackColourTyre() {
        System.out.println("blackTyre");
    }

    @Override
    public void changeGear() {
        System.out.println("Change Gear");
    }
}

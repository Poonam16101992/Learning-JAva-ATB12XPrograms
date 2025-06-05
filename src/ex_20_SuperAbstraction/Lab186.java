package ex_20_SuperAbstraction;

public class Lab186 {
    public static void main(String[] args) {
        Car c1= new Car();
        c1.display();
    }
}
class Vehicle{
    public int maxSpeed=180;
    void emptyMethod(){
        System.out.println("Empty method");
    }
    Vehicle(){
        System.out.println("Default Constructor");
    }
    Vehicle(int a){
        System.out.println("Param constructor");
    }
    Vehicle(int a, int b){
        System.out.println("multi param constructor");
    }
    void message(){
        System.out.println("no return type no arg");
    }
    void message(int a){
        System.out.println("no return type , with parameter ");
    }
    void display(){
        System.out.println("Display");
    }
}

class Car extends Vehicle{
    private int maxSpeed=200;

    Car(){
        super();
    }
    void test(){

    }
    Car(int a){
        System.out.println("Car");
    }
    @Override
    void display(){
        System.out.println("Car overriden");
        System.out.println(super.maxSpeed);
        super.display();
        System.out.println(this.maxSpeed);

    }
}
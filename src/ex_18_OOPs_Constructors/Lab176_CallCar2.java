package ex_18_OOPs_Constructors;

public class Lab176_CallCar2 {

    public static void main(String[] args) {
        Car2 Tesla= new Car2();
        System.out.println(Tesla.Model);
        System.out.println(Tesla.Year);

        Car2 Nano= new Car2("SUV",1990);
        System.out.println(Nano.Model);
        System.out.println(Nano.Year);

        Car2 MG= new Car2("XXX");
        System.out.println(MG.Model);

    }
}

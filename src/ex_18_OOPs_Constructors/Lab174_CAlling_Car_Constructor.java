package ex_18_OOPs_Constructors;

public class Lab174_CAlling_Car_Constructor {
    public static void main(String[] args) {
        Car Car1= new Car();
        Car1.name="Tesla";
        System.out.println(Car1.name);
        System.out.println(Car1.Modal);
        System.out.println(Car1.Year);

        Car Car2= new Car();
        Car2.name="Tat NAno";
        System.out.println(Car2.name);
        System.out.println(Car2.Year);
        System.out.println(Car2.Modal);

        LoginPage l= new LoginPage();
    }

}

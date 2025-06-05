package ex_18_OOPs_Constructors;

public class Car2 {

    String Model;
    int Year;

    Car2(){//Non-parametrised constructor
        Model= "XUV";
        Year= 1999;
        System.out.println("Dc");

    }
    Car2(String Model_name,int Year_created){
        this.Model=Model_name;//This---> reference object
        this.Year=Year_created;
    }
    Car2(String Model_name){//constructor overloading
        this.Model=Model_name;
    }

}

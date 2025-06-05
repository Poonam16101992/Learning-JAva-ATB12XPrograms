package ex_17_OOPS;

public class Lab168 {

    public static void main(String[] args) {

        ATBx poonam;// ATB-->Class, poonam-->object reference and this process is called class loading into JVM
        poonam= new ATBx();// new ATBX --> is the object


        poonam.gender="Female";//----> Accessing the attribute
        poonam.sleep();// ---> accessing the behaviour

        ATBx praveen= new ATBx();//---> created another object
        praveen.sleep();
        praveen.name="Praveen chaudhary";

    }
}

package ex_18_OOPs_Constructors;

public class LAb_OOps {
    public static void main(String[] args) {
        Baby b= new Baby();
        Baby c= new Baby();
        new Baby();
        Baby d;
    }
}
class Baby{
    Baby() {//This gets called automatically when an object is craeted

        System.out.println("Baby is born");
    }

    String name;

}
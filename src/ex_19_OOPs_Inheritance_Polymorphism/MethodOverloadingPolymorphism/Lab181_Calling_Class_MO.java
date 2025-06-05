package ex_19_OOPs_Inheritance_Polymorphism.MethodOverloadingPolymorphism;

public class Lab181_Calling_Class_MO {
    public static void main(String[] args) {

        MathsOperationClass m1= new MathsOperationClass();
        int r=m1.add(5,6);
        double r1=m1.add(2.1,2.8);
        int r2=m1.add(10,9,8);
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
    }
}

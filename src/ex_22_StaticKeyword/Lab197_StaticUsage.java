package ex_22_StaticKeyword;

public class Lab197_StaticUsage {
    public static void main(String[] args) {
        Student S1= new Student(21);
        Student S2= new Student(26);

        System.out.println(S1.age);
        System.out.println(S2.age);
        System.out.println(S1.Course);
        System.out.println(S2.Course);
        S1.m1();
        S2.m1();
    }
}
class Student{
    int age;//non-static
    static String Course="ATB";

    public Student(int age) {
        this.age = age;
    }

    static void m1(){
        System.out.println("function is static");
    }
}

package ex_05_TypeCasting;

public class Lab062_TypeCasting_Example {

    public static void main(String[] args) {

        int course_amount=100;
        float GST = 18.50f;

        int total= course_amount+(int)GST;//Narrowing
        float total1= (float)course_amount+ GST;//Widening

        System.out.println(total);
        System.out.println(total1);
    }
}

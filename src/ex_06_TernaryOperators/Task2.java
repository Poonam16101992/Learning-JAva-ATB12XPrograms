package ex_06_TernaryOperators;

public class Task2 {
    public static void main(String[] args) {

        int x=30,y=90,z=5;
        String max = (x>y && x>z)?"x is max":((y>x && y>z)?" y is max":"z is max");
        System.out.println(max);
    }
}

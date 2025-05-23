package ex_06_TernaryOperators;

public class Lab068_MaxNumberOfThreeNumbers {
    public static void main(String[] args) {

        int x=30,y=-90,z=5;
        String max = (x>y && x>z)?"x is max":((y>x && y>z)?" y is max":"z is max");
        System.out.println(max);
//OR we can do like this
        int result= (x>y)?((x>z)?x:y):((y>z)?y:z);
        System.out.println(result);

    }
}

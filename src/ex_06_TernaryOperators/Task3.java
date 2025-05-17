package ex_06_TernaryOperators;

public class Task3 {
    public static void main(String[] args) {
        int age=90;
        String Category= (age<18)? "Minor":(age>65)?"Senior":"Adult";

        System.out.println(Category);
    }
}

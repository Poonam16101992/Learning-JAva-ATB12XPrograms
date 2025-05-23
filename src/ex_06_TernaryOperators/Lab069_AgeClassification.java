package ex_06_TernaryOperators;

public class Lab069_AgeClassification {
    public static void main(String[] args) {
        String user_input= args[0];
        int age = Integer.parseInt(user_input);
        System.out.println(user_input instanceof String);
        String Category= (age<18)? "Minor":(age>65)?"Senior":"Adult";

        System.out.println(Category);
    }
}

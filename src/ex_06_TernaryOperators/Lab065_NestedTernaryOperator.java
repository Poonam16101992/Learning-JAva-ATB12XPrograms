package ex_06_TernaryOperators;

public class Lab065_NestedTernaryOperator {
    public static void main(String[] args) {
        int age =17;
        String result= (age<18)? "You can't go":(age>20)?"You can Go to Goa and drink":"Yo can go to goa but can't drink";
        System.out.println(result);
    }
}

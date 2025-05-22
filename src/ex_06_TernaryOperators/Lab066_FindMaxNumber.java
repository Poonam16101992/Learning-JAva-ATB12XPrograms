package ex_06_TernaryOperators;

public class Lab066_FindMaxNumber {
    public static void main(String[] args) {
        int x=12,y=20;
        System.out.println(Math.max(x,y));
        int result= (x>y)?x:y;
        System.out.println(result);
    }
}

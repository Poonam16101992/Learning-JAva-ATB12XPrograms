package ex_13_Functions;

public class Lab129_UserdefnedFunction_with_parameters {
    public static void main(String[] args) {
int Sum= sum_of_two_num(2,4);
        System.out.println("Sum of numbers given is  "+Sum);
    }
    static int sum_of_two_num(int a,int b){
        return a+b;
    }
}

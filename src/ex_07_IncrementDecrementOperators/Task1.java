package ex_07_IncrementDecrementOperators;

public class Task1 {
    public static void main(String[] args) {
        int i=11;//i=11
        i=i++ + ++i;//i++=11,i=12,++i=13,i=13---->11+13=24
        System.out.println(i);//i=24
    }
}

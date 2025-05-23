package ex_07_IncrementDecrementOperators;

public class Task2 {
    public static void main(String[] args) {
         int a=11,b=22,c;//a=11,b=22
         c=a + b + a++ + b++ + ++a + ++b;//a=11|b=22|a++=11|a=12|b++=22|b=23|++a=13|a=13|++b=24|b=24
        System.out.println("a ="+a);//a=13
        System.out.println("b ="+b);//b=24
        System.out.println("c ="+c);//c=11+22+11+22+13+24=103

    }
}

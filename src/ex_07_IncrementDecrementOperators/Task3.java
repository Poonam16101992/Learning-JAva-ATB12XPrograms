package ex_07_IncrementDecrementOperators;

public class Task3 {
    public static void main(String[] args) {
        int i=1,j=2,k=3;
        int m = i-- - j-- - k--;  //i--=1|i=0|j--=2|j=1|k--=3|k=2|m=(1-2-3)=-4
        System.out.println("i="+i+",j="+j+",k="+k+",m="+m);  //i=0|j=1|k=2|m=-4
    }
}

package ex_16_Arrays;

public class Lab159_SumOfArrays {
    public static void main(String[] args) {

        int[] num={12,23,34};
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        System.out.println(sum);
    }
}

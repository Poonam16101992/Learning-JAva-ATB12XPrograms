package ex_16_Arrays;

public class Lab156_Arrays_Max_min {

    public static void main(String[] args) {
        int[] num={12,67,90,87,91};
int max = max_element(num);
int min = min_element(num);
        System.out.println("max number is "+ max);
        System.out.println("mix number is "+ min);

    }
    static int max_element(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        } return max;
    }
    static int min_element(int[] num){
        int min=num[0];
        for(int i=0;i<num.length;i++) {
            if (num[i] < min) {
                min = num[i];
            }
        } return min;
    }





}

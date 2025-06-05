package ex_16_Arrays;

public class Lab160_SecondHighestArrayelemet {
    public static void main(String[] args) {
        int num[]={12,34,56,9,98};
        int highest=0;
        int second_highest=0;

        for(int i=0;i<num.length;i++){
            if(num[i]>highest){
                second_highest=highest;
                highest=num[i];}
            else if(num[i]>second_highest&& num[i]!=highest){
                second_highest=num[i];

            }

        }System.out.println(second_highest);
        System.out.println(highest);
    }
}

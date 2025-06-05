package ex_16_Arrays;

public class Lab155_For_loop {
    public static void main(String[] args) {

        int[] marks={51,100,91,11,89};
        for(int i=0;i<marks.length;i++){// for loop
            System.out.println(marks[i]);
        }
        for(int mark:marks){//enhanced for loop
            System.out.println(mark);
        }
    }
}

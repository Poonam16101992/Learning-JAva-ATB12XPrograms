package ex_10_For_Loop;

public class Lab113_Even_Num_Using_Continue {
    public static void main(String[] args) {
        for (int i = 0; i <=50 ; i++) {
            if(i%2!=0){
                continue;

            }
            System.out.println("Even-->"+i);
        }
    }
}

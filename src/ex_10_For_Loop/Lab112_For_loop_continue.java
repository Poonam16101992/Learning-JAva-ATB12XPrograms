package ex_10_For_Loop;

public class Lab112_For_loop_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            // System.out.println(i); //this will print 0 to 5
            if(i==5){
                continue;

            }
            System.out.println(i);//this will skip 5
        }
    }
}

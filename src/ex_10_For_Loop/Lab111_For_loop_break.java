package ex_10_For_Loop;

public class Lab111_For_loop_break {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            // System.out.println(i); //this will print 0 to 5
            if(i==5){
                System.out.println(i);//this will print 5
                break;

            }
            //System.out.println(i);//this will print 1 to 4
        }
    }
}

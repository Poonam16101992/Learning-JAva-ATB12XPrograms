package ex_10_For_Loop;

public class Lab109_GreaterVsEqual {

    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.println("#");//0 to 9----10 times
            for (int j = 0; j <=10 ; j++) {
                System.out.println("^");//0 to 10----11 times
                for (int k = 1; k <=10 ; k++) {//1 to 10---10 times
                    System.out.println("*");

                }

            }

        }
    }
}

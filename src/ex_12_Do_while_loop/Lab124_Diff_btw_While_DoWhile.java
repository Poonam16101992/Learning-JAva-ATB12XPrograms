package ex_12_Do_while_loop;

public class Lab124_Diff_btw_While_DoWhile {

    public static void main(String[] args) {

        int a = 0;
       /* while (a < 0) {
            System.out.println("a");
            a++
            };*/                 //this will be executed only when condition holds true

           do {
                System.out.println("a");// This will be executed once even if the condition holds false
                a++;
            } while (a < 0);
        }
    }

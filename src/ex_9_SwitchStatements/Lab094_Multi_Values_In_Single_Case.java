package ex_9_SwitchStatements;

public class Lab094_Multi_Values_In_Single_Case {
    public static void main(String[] args) {


        int itemCode=110;
        switch(itemCode) {
            case 001, 003, 004 -> System.out.println(001);
            case 002, 005, 006 -> System.out.println(002);
            case 110, 007 -> System.out.println(110);
            default -> System.out.println("Default");
        }
    }
}

package ex_07_IncrementDecrementOperators;

public class Lab070_UserInput_Example {
    public static void main(String[] args) {
        String a0= args[0];
        String a1= args[1];
        String a2= args[2];
        String a3= args[3];

        System.out.println(a0);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);// if arguments are less then error "java.lang.ArrayIndexOutOfBoundException"

        int age = Integer.parseInt(a0);
        System.out.println(age);

        float f = Float.parseFloat(a3);
        System.out.println(f);



    }

}

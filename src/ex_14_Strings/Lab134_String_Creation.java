package ex_14_Strings;

public class Lab134_String_Creation {
    public static void main(String[] args) {
        String s="Poonam";//this values stores in String constant Pool
        String s1= new String("Poonam");//this value stores in Object area
        System.out.println(s);
        System.out.println(s1);
        boolean s2 = (s==s1);
        System.out.println(s2);

    }
}


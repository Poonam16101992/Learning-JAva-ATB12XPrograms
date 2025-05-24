package ex_14_Strings;

public class LAb143_StringExmaple {
    public static void main(String[] args) {

        String s= "PoonamSharma";
        System.out.println(s.substring(3));

        System.out.println(s.substring(1,3));

        System.out.println(s.toCharArray());

        System.out.println(s.trim());//removes space from starting and end

        System.out.println(s.repeat(3));

        System.out.println(String.format("%s=%d","Age",30 ));
    }
}

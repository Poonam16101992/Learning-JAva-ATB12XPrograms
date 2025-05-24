package ex_14_Strings;

public class Lab141_StringExample {

    public static void main(String[] args) {

        String s="JAVA";
        char c= s.charAt(2);// this function will provide the character present at the mentioned index
        System.out.println(c);

        System.out.println(s.codePointAt(3));//this will provide the uni-code value of the character indexed at

        int result= "abc".compareTo("ABC");//this will provide integer(diff) based on comparison
        System.out.println(result);
        int result1= "abc".compareToIgnoreCase("ABC");//this will provide integer(diff) based on comparison ignoring the case
        System.out.println(result1);

        int idx= s.indexOf("V");//this will provide the index
        System.out.println(idx);
        System.out.println(s.lastIndexOf("A"));

        boolean b= "".isEmpty();
        System.out.println(b);

        String s1= String.join("-",s,"vita");//this will join via delimiter "-"
        System.out.println(s1);

        System.out.println(s.replace("A","O"));

        System.out.println(s.startsWith("JA"));


    }
}

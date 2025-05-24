package ex_14_Strings;

public class Lab139_InterviewPart1 {
    public static void main(String[] args) {
        String s= "Hello";
        String s1="Hello";// only 1 string is present in String Constant Pool
        String s2="hello";//2 strings are present in SCP

        String s3= new String("Hello");//1 string is present in Object area
        String s4= new String("Hello");// 2 Strings are present in OA
        String s5= new String("hello");//3 strings are present in OA

        //== checks the reference location of the strings
        System.out.println(s==s3);
        System.out.println(s3==s4);
        System.out.println(s==s1);

        //equals(content)---checks the content of the string

        System.out.println(s.equals(s3));
        System.out.println(s.equals(s5));

        //equalsIgnoreCase---checks the content with ignoring the case

        System.out.println(s.equalsIgnoreCase(s5));


    }
}

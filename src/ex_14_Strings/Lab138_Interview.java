package ex_14_Strings;

public class Lab138_Interview {
    public static void main(String[] args) {
        String s= "Hello";
        String s1="Hello";// only 1 string is present in String Constant Pool
        String s2="hello";//2 strings are present in SCP

        String s3= new String("Hello");//1 string is present in Object area
        String s4= new String("Hello");// 2 Strings are present in OA
        String s5= new String("hello");//3 strings are present in OA


    }
}

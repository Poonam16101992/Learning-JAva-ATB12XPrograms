package ex_15_StringBuffer_StringBuilder;

public class Lab146_StringBuffer {

    public static void main(String[] args) {

        StringBuffer sb= new StringBuffer("Poonam");//object creation
        sb.append("Sharma");//appending string
        System.out.println(sb);


        // in case of string
        String s1= "Poonam";
        s1= s1+"Sharma";
        System.out.println(s1);


    }
}

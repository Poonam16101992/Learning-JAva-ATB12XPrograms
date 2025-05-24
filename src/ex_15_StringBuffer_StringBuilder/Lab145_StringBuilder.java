package ex_15_StringBuffer_StringBuilder;

public class Lab145_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Poonam");
        StringBuffer sbu= new StringBuffer("Poonam");

        System.out.println(sb);
        System.out.println(sbu);
        System.out.println(sbu.reverse());
        System.out.println(sb.reverse());
    }
}
